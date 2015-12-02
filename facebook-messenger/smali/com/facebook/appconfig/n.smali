.class public abstract Lcom/facebook/appconfig/n;
.super Ljava/lang/Object;
.source "BaseConfigManager.java"


# instance fields
.field protected final a:Lcom/facebook/appconfig/b;


# direct methods
.method public constructor <init>(Lcom/facebook/appconfig/b;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/facebook/appconfig/n;->a:Lcom/facebook/appconfig/b;

    .line 19
    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 96
    invoke-virtual {p0}, Lcom/facebook/appconfig/n;->g()Lcom/facebook/appconfig/AppConfig;

    move-result-object v0

    .line 97
    if-eqz v0, :cond_0

    .line 98
    invoke-virtual {v0}, Lcom/facebook/appconfig/AppConfig;->a()Lcom/facebook/common/bundle/ImmutableBundle;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/common/bundle/ImmutableBundle;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 100
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected a(Ljava/lang/String;I)I
    .locals 1

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/facebook/appconfig/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 59
    if-nez v0, :cond_0

    .line 62
    :goto_0
    return p2

    :cond_0
    invoke-static {v0, p2}, Lcom/facebook/common/w/t;->a(Ljava/lang/Object;I)I

    move-result p2

    goto :goto_0
.end method

.method protected a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 84
    invoke-direct {p0, p1}, Lcom/facebook/appconfig/n;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 85
    if-nez v0, :cond_0

    .line 88
    :goto_0
    return-object p2

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0
.end method

.method public f()J
    .locals 2

    .prologue
    .line 27
    invoke-virtual {p0}, Lcom/facebook/appconfig/n;->g()Lcom/facebook/appconfig/AppConfig;

    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/appconfig/AppConfig;->b()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method protected g()Lcom/facebook/appconfig/AppConfig;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/appconfig/n;->a:Lcom/facebook/appconfig/b;

    invoke-virtual {v0}, Lcom/facebook/appconfig/b;->a()Lcom/facebook/appconfig/AppConfig;

    move-result-object v0

    return-object v0
.end method

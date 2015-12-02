.class public Lcom/facebook/orca/r/a;
.super Ljava/lang/Object;
.source "IsUserCurrentlyZeroRatedProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Lcom/facebook/common/w/q;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;Ljavax/inject/a;)V
    .locals 0
    .param p2    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/zero/annotations/IsZeroRatingFeatureEnabled;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/d;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/orca/r/a;->a:Lcom/facebook/prefs/shared/d;

    .line 24
    iput-object p2, p0, Lcom/facebook/orca/r/a;->b:Ljavax/inject/a;

    .line 25
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/w/q;
    .locals 3

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/r/a;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 30
    sget-object v0, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    .line 42
    :goto_0
    return-object v0

    .line 33
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/r/a;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/zero/a/c;->e:Lcom/facebook/prefs/shared/ae;

    const-string v2, "unknown"

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 37
    const-string v1, "disabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 38
    sget-object v0, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    goto :goto_0

    .line 39
    :cond_1
    const-string v1, "enabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 40
    sget-object v0, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    goto :goto_0

    .line 42
    :cond_2
    sget-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 14
    invoke-virtual {p0}, Lcom/facebook/orca/r/a;->a()Lcom/facebook/common/w/q;

    move-result-object v0

    return-object v0
.end method

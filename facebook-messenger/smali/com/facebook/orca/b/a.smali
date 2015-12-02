.class public Lcom/facebook/orca/b/a;
.super Ljava/lang/Object;
.source "IsAnalyticsEnabledProvider.java"

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


# static fields
.field private static final a:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/prefs/shared/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-string v0, "messenger_client_analytics_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/b/a;->a:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/prefs/shared/d;)V
    .locals 0
    .param p1    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/auth/annotations/LoggedInUser;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/facebook/prefs/shared/d;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/orca/b/a;->b:Ljavax/inject/a;

    .line 31
    iput-object p2, p0, Lcom/facebook/orca/b/a;->c:Lcom/facebook/prefs/shared/d;

    .line 32
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/w/q;
    .locals 3

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/orca/b/a;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 43
    if-nez v0, :cond_0

    .line 44
    sget-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    .line 51
    :goto_0
    return-object v0

    .line 47
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/b/a;->c:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/b/a;->a:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 48
    sget-object v0, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    goto :goto_0

    .line 51
    :cond_1
    sget-object v0, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 18
    invoke-virtual {p0}, Lcom/facebook/orca/b/a;->a()Lcom/facebook/common/w/q;

    move-result-object v0

    return-object v0
.end method

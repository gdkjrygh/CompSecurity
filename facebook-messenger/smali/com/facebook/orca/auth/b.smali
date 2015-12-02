.class public Lcom/facebook/orca/auth/b;
.super Lcom/facebook/inject/d;
.source "IsPartialAccountProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/auth/b/a;

.field private final b:Lcom/facebook/prefs/shared/d;


# direct methods
.method public constructor <init>(Lcom/facebook/auth/b/a;Lcom/facebook/prefs/shared/d;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/orca/auth/b;->a:Lcom/facebook/auth/b/a;

    .line 25
    iput-object p2, p0, Lcom/facebook/orca/auth/b;->b:Lcom/facebook/prefs/shared/d;

    .line 26
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 30
    iget-object v1, p0, Lcom/facebook/orca/auth/b;->a:Lcom/facebook/auth/b/a;

    invoke-interface {v1}, Lcom/facebook/auth/b/a;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/auth/b;->b:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/auth/e/a;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 15
    invoke-virtual {p0}, Lcom/facebook/orca/auth/b;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

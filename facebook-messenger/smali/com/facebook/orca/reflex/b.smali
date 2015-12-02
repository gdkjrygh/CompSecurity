.class public Lcom/facebook/orca/reflex/b;
.super Ljava/lang/Object;
.source "IsReflexThreadListEnabledProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Ljava/lang/Boolean;",
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
            "Lcom/facebook/common/w/q;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/orca/reflex/e;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;Ljavax/inject/a;Lcom/facebook/orca/reflex/e;)V
    .locals 0
    .param p2    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/orca/reflex/ReflexThreadListGatekeeper;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/d;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;",
            "Lcom/facebook/orca/reflex/e;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/facebook/orca/reflex/b;->a:Lcom/facebook/prefs/shared/d;

    .line 29
    iput-object p2, p0, Lcom/facebook/orca/reflex/b;->b:Ljavax/inject/a;

    .line 30
    iput-object p3, p0, Lcom/facebook/orca/reflex/b;->c:Lcom/facebook/orca/reflex/e;

    .line 31
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 2

    .prologue
    .line 38
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-ge v0, v1, :cond_0

    .line 39
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 45
    :goto_0
    return-object v0

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/reflex/b;->a:Lcom/facebook/prefs/shared/d;

    invoke-static {v0}, Lcom/facebook/orca/prefs/an;->a(Lcom/facebook/prefs/shared/d;)Lcom/facebook/common/w/q;

    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lcom/facebook/common/w/q;->isSet()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 43
    invoke-virtual {v0}, Lcom/facebook/common/w/q;->asBoolean()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 45
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/reflex/b;->c:Lcom/facebook/orca/reflex/e;

    invoke-virtual {v0}, Lcom/facebook/orca/reflex/e;->b()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/reflex/b;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/w/q;

    sget-object v1, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    invoke-virtual {v0, v1}, Lcom/facebook/common/w/q;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 17
    invoke-virtual {p0}, Lcom/facebook/orca/reflex/b;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

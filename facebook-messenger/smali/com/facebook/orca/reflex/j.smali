.class public Lcom/facebook/orca/reflex/j;
.super Ljava/lang/Object;
.source "ThreadListActivityComponentProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Landroid/content/ComponentName;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

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
.method public constructor <init>(Landroid/content/Context;Ljavax/inject/a;)V
    .locals 0
    .param p2    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/orca/reflex/IsReflexThreadListEnabled;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/orca/reflex/j;->a:Landroid/content/Context;

    .line 25
    iput-object p2, p0, Lcom/facebook/orca/reflex/j;->b:Ljavax/inject/a;

    .line 26
    return-void
.end method


# virtual methods
.method public a()Landroid/content/ComponentName;
    .locals 3

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/orca/reflex/j;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 34
    new-instance v0, Landroid/content/ComponentName;

    iget-object v1, p0, Lcom/facebook/orca/reflex/j;->a:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/reflex/ReflexBasedThreadListActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 36
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Landroid/content/ComponentName;

    iget-object v1, p0, Lcom/facebook/orca/reflex/j;->a:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/threadlist/FrameworkBasedThreadListActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 16
    invoke-virtual {p0}, Lcom/facebook/orca/reflex/j;->a()Landroid/content/ComponentName;

    move-result-object v0

    return-object v0
.end method

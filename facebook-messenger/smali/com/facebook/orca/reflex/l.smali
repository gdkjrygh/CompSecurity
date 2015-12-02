.class Lcom/facebook/orca/reflex/l;
.super Ljava/lang/Object;
.source "ThreadListView.java"

# interfaces
.implements Lcom/facebook/reflex/ah;


# instance fields
.field final synthetic a:Lcom/facebook/orca/reflex/k;


# direct methods
.method constructor <init>(Lcom/facebook/orca/reflex/k;)V
    .locals 0

    .prologue
    .line 23
    iput-object p1, p0, Lcom/facebook/orca/reflex/l;->a:Lcom/facebook/orca/reflex/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/reflex/aj;FF)V
    .locals 2

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/orca/reflex/l;->a:Lcom/facebook/orca/reflex/k;

    invoke-static {v0}, Lcom/facebook/orca/reflex/k;->a(Lcom/facebook/orca/reflex/k;)Lcom/facebook/orca/threadlist/i;

    move-result-object v1

    sget-object v0, Lcom/facebook/reflex/aj;->Fling:Lcom/facebook/reflex/aj;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, p2, p3, v0}, Lcom/facebook/orca/threadlist/i;->a(FFZ)V

    .line 27
    return-void

    .line 26
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

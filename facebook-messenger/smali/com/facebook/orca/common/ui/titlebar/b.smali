.class Lcom/facebook/orca/common/ui/titlebar/b;
.super Ljava/lang/Object;
.source "DivebarController.java"

# interfaces
.implements Lcom/a/a/ar;


# instance fields
.field final synthetic a:Ljava/util/Set;

.field final synthetic b:Lcom/facebook/orca/common/ui/titlebar/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/a;Ljava/util/Set;)V
    .locals 0

    .prologue
    .line 559
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/b;->b:Lcom/facebook/orca/common/ui/titlebar/a;

    iput-object p2, p0, Lcom/facebook/orca/common/ui/titlebar/b;->a:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/a/a/ak;)V
    .locals 3

    .prologue
    .line 562
    invoke-virtual {p1}, Lcom/a/a/ak;->l()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    .line 563
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/b;->b:Lcom/facebook/orca/common/ui/titlebar/a;

    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/b;->a:Ljava/util/Set;

    invoke-static {v1, v2, v0}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/a;Ljava/util/Set;F)V

    .line 564
    return-void
.end method

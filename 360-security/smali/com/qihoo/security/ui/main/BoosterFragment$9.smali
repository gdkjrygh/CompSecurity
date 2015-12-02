.class Lcom/qihoo/security/ui/main/BoosterFragment$9;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/BoosterFragment;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/BoosterFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V
    .locals 0

    .prologue
    .line 767
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$9;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 771
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$9;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Z)V

    .line 772
    return-void
.end method

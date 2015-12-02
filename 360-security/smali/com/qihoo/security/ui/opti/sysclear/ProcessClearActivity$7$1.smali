.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;->a(Ljava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 904
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7$1;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;

    iput-object p2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7$1;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 907
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7$1;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 908
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7$1;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7$1;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Ljava/util/List;)V

    .line 918
    :cond_0
    return-void
.end method

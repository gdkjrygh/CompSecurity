.class Lcom/qihoo/security/locale/LanguageFragment$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/locale/LanguageFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/locale/LanguageFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/locale/LanguageFragment;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/qihoo/security/locale/LanguageFragment$1;->a:Lcom/qihoo/security/locale/LanguageFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 55
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 56
    iget-object v0, p0, Lcom/qihoo/security/locale/LanguageFragment$1;->a:Lcom/qihoo/security/locale/LanguageFragment;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/LanguageFragment;->a_(Landroid/os/Message;)V

    .line 57
    return-void
.end method

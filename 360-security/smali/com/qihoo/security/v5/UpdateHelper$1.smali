.class final Lcom/qihoo/security/v5/UpdateHelper$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/v5/UpdateHelper;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/qihoo/security/dialog/b;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/qihoo/security/dialog/b;)V
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lcom/qihoo/security/v5/UpdateHelper$1;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/qihoo/security/v5/UpdateHelper$1;->b:Lcom/qihoo/security/dialog/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 122
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    const/16 v0, 0x697e

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 124
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateHelper$1;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/locale/language/b;->c(Landroid/content/Context;)V

    .line 125
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateHelper$1;->b:Lcom/qihoo/security/dialog/b;

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 127
    :cond_0
    return-void
.end method

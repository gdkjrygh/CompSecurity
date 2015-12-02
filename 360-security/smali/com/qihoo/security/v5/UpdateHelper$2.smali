.class final Lcom/qihoo/security/v5/UpdateHelper$2;
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
.field final synthetic a:Lcom/qihoo/security/dialog/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/dialog/b;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/qihoo/security/v5/UpdateHelper$2;->a:Lcom/qihoo/security/dialog/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateHelper$2;->a:Lcom/qihoo/security/dialog/b;

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 132
    return-void
.end method

.class final Lcom/qihoo/security/v5/UpdateHelper$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


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
    .line 134
    iput-object p1, p0, Lcom/qihoo/security/v5/UpdateHelper$3;->a:Lcom/qihoo/security/dialog/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 137
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateHelper$3;->a:Lcom/qihoo/security/dialog/b;

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 139
    const/4 v0, 0x1

    .line 141
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

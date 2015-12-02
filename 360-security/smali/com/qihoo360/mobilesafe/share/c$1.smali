.class final Lcom/qihoo360/mobilesafe/share/c$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/share/c;->a(Landroid/content/Context;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/dialog/h;


# direct methods
.method constructor <init>(Lcom/qihoo/security/dialog/h;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/share/c$1;->a:Lcom/qihoo/security/dialog/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onShow(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/share/c$1;->a:Lcom/qihoo/security/dialog/h;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/h;->a()V

    .line 117
    return-void
.end method

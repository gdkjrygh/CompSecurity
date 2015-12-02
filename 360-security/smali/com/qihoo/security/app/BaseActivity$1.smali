.class Lcom/qihoo/security/app/BaseActivity$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/app/BaseActivity;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/app/BaseActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/app/BaseActivity;)V
    .locals 0

    .prologue
    .line 162
    iput-object p1, p0, Lcom/qihoo/security/app/BaseActivity$1;->a:Lcom/qihoo/security/app/BaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity$1;->a:Lcom/qihoo/security/app/BaseActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/app/BaseActivity;->n()V

    .line 166
    return-void
.end method

.class Lcom/qihoo/security/app/BaseActivity$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/app/BaseActivity;->a(Landroid/view/Menu;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/MenuItem;

.field final synthetic b:Lcom/qihoo/security/app/BaseActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/app/BaseActivity;Landroid/view/MenuItem;)V
    .locals 0

    .prologue
    .line 418
    iput-object p1, p0, Lcom/qihoo/security/app/BaseActivity$2;->b:Lcom/qihoo/security/app/BaseActivity;

    iput-object p2, p0, Lcom/qihoo/security/app/BaseActivity$2;->a:Landroid/view/MenuItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 421
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity$2;->b:Lcom/qihoo/security/app/BaseActivity;

    iget-object v1, p0, Lcom/qihoo/security/app/BaseActivity$2;->a:Landroid/view/MenuItem;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/app/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 422
    return-void
.end method

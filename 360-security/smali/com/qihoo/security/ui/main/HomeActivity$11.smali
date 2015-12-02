.class Lcom/qihoo/security/ui/main/HomeActivity$11;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/HomeActivity;->b(Landroid/view/Menu;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/MenuItem;

.field final synthetic b:Lcom/qihoo/security/ui/main/HomeActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/HomeActivity;Landroid/view/MenuItem;)V
    .locals 0

    .prologue
    .line 734
    iput-object p1, p0, Lcom/qihoo/security/ui/main/HomeActivity$11;->b:Lcom/qihoo/security/ui/main/HomeActivity;

    iput-object p2, p0, Lcom/qihoo/security/ui/main/HomeActivity$11;->a:Landroid/view/MenuItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 737
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$11;->b:Lcom/qihoo/security/ui/main/HomeActivity;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity$11;->a:Landroid/view/MenuItem;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/main/HomeActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 738
    return-void
.end method

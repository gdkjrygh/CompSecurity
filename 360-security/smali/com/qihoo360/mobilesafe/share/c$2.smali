.class final Lcom/qihoo360/mobilesafe/share/c$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/share/c;->a(Landroid/content/Context;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/qihoo/security/dialog/h;

.field final synthetic c:I


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/qihoo/security/dialog/h;I)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/share/c$2;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/share/c$2;->b:Lcom/qihoo/security/dialog/h;

    iput p3, p0, Lcom/qihoo360/mobilesafe/share/c$2;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 123
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/share/c$2;->a:Landroid/content/Context;

    const-string/jumbo v1, "is_click_rating_dialog"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 124
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/share/c$2;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/ui/a;->e(Landroid/content/Context;)V

    .line 125
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/share/c$2;->b:Lcom/qihoo/security/dialog/h;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/h;->dismiss()V

    .line 127
    iget v0, p0, Lcom/qihoo360/mobilesafe/share/c$2;->c:I

    if-nez v0, :cond_1

    .line 128
    const/16 v0, 0x4282

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 134
    :cond_0
    :goto_0
    return-void

    .line 129
    :cond_1
    iget v0, p0, Lcom/qihoo360/mobilesafe/share/c$2;->c:I

    if-ne v0, v2, :cond_2

    .line 130
    const/16 v0, 0x426b

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    goto :goto_0

    .line 131
    :cond_2
    iget v0, p0, Lcom/qihoo360/mobilesafe/share/c$2;->c:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 132
    const/16 v0, 0x426c

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    goto :goto_0
.end method

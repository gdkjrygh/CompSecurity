.class final Lcom/qihoo/security/opti/trashclear/ui/g$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Lcom/qihoo/security/dialog/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lcom/qihoo/security/dialog/j;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Ljava/lang/String;Lcom/qihoo/security/dialog/j;)V
    .locals 0

    .prologue
    .line 264
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/g$1;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/g$1;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/qihoo/security/opti/trashclear/ui/g$1;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/qihoo/security/opti/trashclear/ui/g$1;->d:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iput-object p5, p0, Lcom/qihoo/security/opti/trashclear/ui/g$1;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/qihoo/security/opti/trashclear/ui/g$1;->f:Lcom/qihoo/security/dialog/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 268
    packed-switch p3, :pswitch_data_0

    .line 276
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/g$1;->f:Lcom/qihoo/security/dialog/j;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/app/Dialog;)V

    .line 277
    return-void

    .line 270
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/g$1;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/g$1;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/g$1;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/g$1;->d:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    goto :goto_0

    .line 273
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/g$1;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/g$1;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/g$1;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/g$1;->d:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    goto :goto_0

    .line 268
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

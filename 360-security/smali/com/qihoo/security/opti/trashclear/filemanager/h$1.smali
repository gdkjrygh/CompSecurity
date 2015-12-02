.class final Lcom/qihoo/security/opti/trashclear/filemanager/h$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/h;->a(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/dialog/j;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/qihoo/security/dialog/j;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/h$1;->a:Lcom/qihoo/security/dialog/j;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/h$1;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/qihoo/security/opti/trashclear/filemanager/h$1;->c:Landroid/content/Context;

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
    .line 97
    const-string/jumbo v0, "*/*"

    .line 98
    packed-switch p3, :pswitch_data_0

    .line 112
    :goto_0
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/h$1;->a:Lcom/qihoo/security/dialog/j;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/app/Dialog;)V

    .line 114
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 115
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 116
    const-string/jumbo v2, "android.intent.action.VIEW"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 117
    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/filemanager/h$1;->b:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 118
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/h$1;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    :goto_1
    return-void

    .line 100
    :pswitch_0
    const-string/jumbo v0, "text/plain"

    goto :goto_0

    .line 103
    :pswitch_1
    const-string/jumbo v0, "audio/*"

    goto :goto_0

    .line 106
    :pswitch_2
    const-string/jumbo v0, "video/*"

    goto :goto_0

    .line 109
    :pswitch_3
    const-string/jumbo v0, "image/*"

    goto :goto_0

    .line 119
    :catch_0
    move-exception v0

    .line 120
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/h$1;->c:Landroid/content/Context;

    const v1, 0x7f0c0076

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/content/Context;II)V

    goto :goto_1

    .line 98
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

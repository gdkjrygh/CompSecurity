.class final Lkik/android/widget/ep;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/WebTrayWidget$a;


# direct methods
.method constructor <init>(Lkik/android/widget/WebTrayWidget$a;)V
    .locals 0

    .prologue
    .line 215
    iput-object p1, p0, Lkik/android/widget/ep;->a:Lkik/android/widget/WebTrayWidget$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6

    .prologue
    .line 220
    iget-object v0, p0, Lkik/android/widget/ep;->a:Lkik/android/widget/WebTrayWidget$a;

    invoke-virtual {v0, p3}, Lkik/android/widget/WebTrayWidget$a;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 221
    instance-of v1, v0, Lkik/android/b/ac$a;

    if-eqz v1, :cond_1

    .line 222
    check-cast v0, Lkik/android/b/ac$a;

    .line 224
    const-string v1, "https://stickers.kik.com/"

    invoke-virtual {v0}, Lkik/android/b/ac$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 225
    iget-object v1, p0, Lkik/android/widget/ep;->a:Lkik/android/widget/WebTrayWidget$a;

    iget-object v1, v1, Lkik/android/widget/WebTrayWidget$a;->a:Lkik/android/widget/WebTrayWidget;

    iget-object v1, v1, Lkik/android/widget/WebTrayWidget;->b:Lcom/kik/android/a;

    const-string v2, "Sticker Store Opened"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Source"

    const-string v3, "From Media Tray"

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/android/a$f;->b()V

    .line 230
    :cond_0
    iget-object v1, p0, Lkik/android/widget/ep;->a:Lkik/android/widget/WebTrayWidget$a;

    iget-object v1, v1, Lkik/android/widget/WebTrayWidget$a;->a:Lkik/android/widget/WebTrayWidget;

    iget-object v1, v1, Lkik/android/widget/WebTrayWidget;->b:Lcom/kik/android/a;

    const-string v2, "Media Tray Item Clicked"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "App Type"

    const-string v3, "Card"

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Card URL"

    invoke-virtual {v0}, Lkik/android/b/ac$a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Index"

    int-to-long v4, p3

    invoke-virtual {v1, v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Is Maximized"

    iget-object v3, p0, Lkik/android/widget/ep;->a:Lkik/android/widget/WebTrayWidget$a;

    iget-object v3, v3, Lkik/android/widget/WebTrayWidget$a;->a:Lkik/android/widget/WebTrayWidget;

    invoke-static {v3}, Lkik/android/widget/WebTrayWidget;->a(Lkik/android/widget/WebTrayWidget;)Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Is Landscape"

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    const/4 v4, 0x2

    if-ne v1, v4, :cond_2

    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v2, v3, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/android/a$f;->b()V

    .line 237
    iget-object v1, p0, Lkik/android/widget/ep;->a:Lkik/android/widget/WebTrayWidget$a;

    iget-object v1, v1, Lkik/android/widget/WebTrayWidget$a;->a:Lkik/android/widget/WebTrayWidget;

    iget-object v1, v1, Lkik/android/widget/WebTrayWidget;->b:Lcom/kik/android/a;

    const-string v2, "Browser Screen Opened"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Reason"

    const-string v3, "Media Tray"

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "URL"

    invoke-virtual {v0}, Lkik/android/b/ac$a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Domain"

    invoke-virtual {v0}, Lkik/android/b/ac$a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/kik/cards/web/bf;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Depth"

    invoke-static {}, Lkik/android/chat/activity/k;->e()I

    move-result v3

    int-to-long v4, v3

    invoke-virtual {v1, v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/android/a$f;->b()V

    .line 244
    iget-object v1, p0, Lkik/android/widget/ep;->a:Lkik/android/widget/WebTrayWidget$a;

    iget-object v1, v1, Lkik/android/widget/WebTrayWidget$a;->a:Lkik/android/widget/WebTrayWidget;

    invoke-virtual {v0}, Lkik/android/b/ac$a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, p3}, Lkik/android/widget/WebTrayWidget;->a(Lkik/android/widget/WebTrayWidget;Ljava/lang/String;I)V

    .line 246
    :cond_1
    return-void

    .line 230
    :cond_2
    const/4 v1, 0x0

    goto :goto_0
.end method

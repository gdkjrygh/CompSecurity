.class Lcom/qihoo/security/gamebooster/AddGamesActivity$a;
.super Landroid/os/AsyncTask;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/AddGamesActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/gamebooster/AddGamesActivity;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 49
    iput-object p2, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->b:Landroid/content/Context;

    .line 50
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->a(Landroid/content/Context;)V

    .line 67
    const/4 v0, 0x0

    return-object v0
.end method

.method protected a(Ljava/lang/Void;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 75
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    iget-object v0, v0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->C:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    iget-object v0, v0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 76
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->d(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Landroid/widget/ListView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->c(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 77
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->b(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 84
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->a(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 85
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->a(Lcom/qihoo/security/gamebooster/AddGamesActivity;Lcom/qihoo/security/gamebooster/AddGamesActivity$a;)Lcom/qihoo/security/gamebooster/AddGamesActivity$a;

    .line 86
    return-void

    .line 79
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->d(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Landroid/widget/ListView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->e(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Lcom/qihoo/security/gamebooster/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 80
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->e(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Lcom/qihoo/security/gamebooster/a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    iget-object v1, v1, Lcom/qihoo/security/gamebooster/AddGamesActivity;->C:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/gamebooster/a;->a(Ljava/util/ArrayList;)V

    .line 81
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->e(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Lcom/qihoo/security/gamebooster/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/a;->notifyDataSetChanged()V

    .line 82
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->b(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 44
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 44
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .prologue
    .line 57
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->a(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 58
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->a:Lcom/qihoo/security/gamebooster/AddGamesActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->b(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 59
    return-void
.end method

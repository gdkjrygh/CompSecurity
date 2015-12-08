.class public abstract Lkik/android/widget/GifWidgetFragment;
.super Lkik/android/chat/fragment/KikFragmentBase;
.source "SourceFile"

# interfaces
.implements Lkik/android/widget/by;


# instance fields
.field protected a:Lkik/a/e/f;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected b:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lcom/kik/l/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private d:Landroid/content/Context;

.field private e:Lkik/android/gifs/a/b;

.field private f:Lkik/android/widget/GifWidget$b;

.field private g:Lkik/android/chat/fragment/KikChatFragment$d;

.field private h:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lkik/android/chat/fragment/KikFragmentBase;-><init>()V

    return-void
.end method

.method protected static a(Landroid/support/v7/widget/RecyclerView;)V
    .locals 2

    .prologue
    .line 162
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v0

    .line 163
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$i;->c(I)V

    .line 164
    return-void
.end method


# virtual methods
.method protected final a(Ljava/lang/String;Lkik/android/widget/au;)Lcom/kik/g/p;
    .locals 5

    .prologue
    .line 127
    new-instance v1, Lcom/kik/g/p;

    invoke-direct {v1}, Lcom/kik/g/p;-><init>()V

    .line 129
    invoke-virtual {p2}, Lkik/android/widget/au;->d()Ljava/util/List;

    move-result-object v2

    .line 131
    if-eqz p1, :cond_0

    .line 132
    iget-object v0, p0, Lkik/android/widget/GifWidgetFragment;->e:Lkik/android/gifs/a/b;

    sget v3, Lkik/android/gifs/a/b$a;->d:I

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    invoke-virtual {v0, p1, v3, v4}, Lkik/android/gifs/a/b;->a(Ljava/lang/String;ILjava/util/Locale;)Lcom/kik/g/p;

    move-result-object v0

    .line 138
    :goto_0
    new-instance v3, Lkik/android/widget/bt;

    invoke-direct {v3, p0, v2, v1, p2}, Lkik/android/widget/bt;-><init>(Lkik/android/widget/GifWidgetFragment;Ljava/util/List;Lcom/kik/g/p;Lkik/android/widget/au;)V

    invoke-virtual {v0, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 157
    return-object v1

    .line 135
    :cond_0
    iget-object v0, p0, Lkik/android/widget/GifWidgetFragment;->e:Lkik/android/gifs/a/b;

    invoke-virtual {v0}, Lkik/android/gifs/a/b;->a()Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0
.end method

.method protected a()V
    .locals 0

    .prologue
    .line 201
    return-void
.end method

.method protected a(I)V
    .locals 0

    .prologue
    .line 174
    iput p1, p0, Lkik/android/widget/GifWidgetFragment;->h:I

    .line 175
    return-void
.end method

.method protected final a(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 168
    sget v0, Lkik/android/widget/GifWidget$a;->f:I

    invoke-virtual {p0, v0}, Lkik/android/widget/GifWidgetFragment;->a(I)V

    .line 169
    const v0, 0x7f090111

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-virtual {p0, v0, v1}, Lkik/android/widget/GifWidgetFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 170
    return-void
.end method

.method protected final a(Lcom/kik/g/f;)V
    .locals 2

    .prologue
    .line 180
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikFragmentBase;->a(Lcom/kik/g/f;)V

    .line 181
    iget-object v0, p0, Lkik/android/widget/GifWidgetFragment;->a:Lkik/a/e/f;

    invoke-interface {v0}, Lkik/a/e/f;->b()Lcom/kik/g/e;

    move-result-object v0

    new-instance v1, Lkik/android/widget/bu;

    invoke-direct {v1, p0}, Lkik/android/widget/bu;-><init>(Lkik/android/widget/GifWidgetFragment;)V

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 196
    return-void
.end method

.method protected final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 206
    iget-object v0, p0, Lkik/android/widget/GifWidgetFragment;->d:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 207
    return-void
.end method

.method protected final a(Lkik/android/chat/fragment/KikChatFragment$d;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lkik/android/widget/GifWidgetFragment;->g:Lkik/android/chat/fragment/KikChatFragment$d;

    .line 66
    return-void
.end method

.method public final a(Lkik/android/gifs/a/f;I)V
    .locals 1

    .prologue
    .line 101
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lkik/android/widget/GifWidgetFragment;->a(Lkik/android/gifs/a/f;ILjava/lang/String;)V

    .line 102
    return-void
.end method

.method protected a(Lkik/android/gifs/a/f;ILjava/lang/String;)V
    .locals 1

    .prologue
    .line 111
    invoke-virtual {p0}, Lkik/android/widget/GifWidgetFragment;->W()V

    .line 112
    iget-object v0, p0, Lkik/android/widget/GifWidgetFragment;->f:Lkik/android/widget/GifWidget$b;

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p0, Lkik/android/widget/GifWidgetFragment;->f:Lkik/android/widget/GifWidget$b;

    invoke-interface {v0, p1, p2, p3}, Lkik/android/widget/GifWidget$b;->a(Lkik/android/gifs/a/f;ILjava/lang/String;)V

    .line 115
    :cond_0
    return-void
.end method

.method protected final a(Lkik/android/widget/GifWidget$b;)V
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lkik/android/widget/GifWidgetFragment;->f:Lkik/android/widget/GifWidget$b;

    .line 91
    return-void
.end method

.method protected b()V
    .locals 0

    .prologue
    .line 222
    return-void
.end method

.method protected c()V
    .locals 0

    .prologue
    .line 217
    return-void
.end method

.method protected d()V
    .locals 0

    .prologue
    .line 212
    return-void
.end method

.method protected final e()Lcom/kik/android/a;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lkik/android/widget/GifWidgetFragment;->b:Lcom/kik/android/a;

    return-object v0
.end method

.method protected final f()Lkik/android/chat/fragment/KikChatFragment$d;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lkik/android/widget/GifWidgetFragment;->g:Lkik/android/chat/fragment/KikChatFragment$d;

    return-object v0
.end method

.method protected final g()Landroid/content/Context;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lkik/android/widget/GifWidgetFragment;->d:Landroid/content/Context;

    return-object v0
.end method

.method protected final h()Lkik/android/gifs/a/b;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lkik/android/widget/GifWidgetFragment;->e:Lkik/android/gifs/a/b;

    return-object v0
.end method

.method protected final i()I
    .locals 1

    .prologue
    .line 95
    iget v0, p0, Lkik/android/widget/GifWidgetFragment;->h:I

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 50
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 51
    invoke-virtual {p0}, Lkik/android/widget/GifWidgetFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/GifWidgetFragment;->d:Landroid/content/Context;

    .line 52
    invoke-virtual {p0}, Lkik/android/widget/GifWidgetFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/GifWidgetFragment;)V

    .line 53
    iget-object v0, p0, Lkik/android/widget/GifWidgetFragment;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkik/android/gifs/a/c;->a(Landroid/content/Context;)Lkik/android/gifs/a/b;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/GifWidgetFragment;->e:Lkik/android/gifs/a/b;

    .line 54
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 59
    invoke-super {p0}, Lkik/android/chat/fragment/KikFragmentBase;->onDestroy()V

    .line 60
    iget-object v0, p0, Lkik/android/widget/GifWidgetFragment;->e:Lkik/android/gifs/a/b;

    invoke-virtual {v0}, Lkik/android/gifs/a/b;->b()V

    .line 61
    return-void
.end method

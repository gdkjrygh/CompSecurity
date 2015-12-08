.class final Lkik/android/widget/bj;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/widget/as;

.field final synthetic b:Lkik/android/widget/GifSearchFragment;


# direct methods
.method constructor <init>(Lkik/android/widget/GifSearchFragment;Lkik/android/widget/as;)V
    .locals 0

    .prologue
    .line 270
    iput-object p1, p0, Lkik/android/widget/bj;->b:Lkik/android/widget/GifSearchFragment;

    iput-object p2, p0, Lkik/android/widget/bj;->a:Lkik/android/widget/as;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 270
    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lkik/android/widget/bj;->b:Lkik/android/widget/GifSearchFragment;

    iget-object v1, p0, Lkik/android/widget/bj;->a:Lkik/android/widget/as;

    invoke-static {v0, p1, v1}, Lkik/android/widget/GifSearchFragment;->a(Lkik/android/widget/GifSearchFragment;Ljava/util/List;Lkik/android/widget/as;)V

    iget-object v0, p0, Lkik/android/widget/bj;->b:Lkik/android/widget/GifSearchFragment;

    invoke-static {v0}, Lkik/android/widget/GifSearchFragment;->h(Lkik/android/widget/GifSearchFragment;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "EMOJI_CACHE"

    invoke-static {p1}, Lkik/android/widget/GifSearchFragment;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "TIMER_CACHE"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 287
    iget-object v0, p0, Lkik/android/widget/bj;->b:Lkik/android/widget/GifSearchFragment;

    invoke-static {v0}, Lkik/android/widget/GifSearchFragment;->i(Lkik/android/widget/GifSearchFragment;)Ljava/util/List;

    move-result-object v0

    .line 288
    if-nez v0, :cond_0

    .line 289
    iget-object v0, p0, Lkik/android/widget/bj;->b:Lkik/android/widget/GifSearchFragment;

    sget v1, Lkik/android/widget/GifWidget$a;->g:I

    invoke-virtual {v0, v1}, Lkik/android/widget/GifSearchFragment;->a(I)V

    .line 294
    :goto_0
    return-void

    .line 292
    :cond_0
    iget-object v1, p0, Lkik/android/widget/bj;->b:Lkik/android/widget/GifSearchFragment;

    iget-object v2, p0, Lkik/android/widget/bj;->a:Lkik/android/widget/as;

    invoke-static {v1, v0, v2}, Lkik/android/widget/GifSearchFragment;->a(Lkik/android/widget/GifSearchFragment;Ljava/util/List;Lkik/android/widget/as;)V

    goto :goto_0
.end method

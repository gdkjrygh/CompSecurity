.class public final Lkik/android/widget/cw;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/cw$a;
    }
.end annotation


# static fields
.field private static a:Lorg/c/b;


# instance fields
.field private final b:Landroid/support/v4/app/FragmentManager;

.field private c:I

.field private d:Ljava/util/ArrayList;

.field private e:Ljava/lang/String;

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-string v0, "PopupFragmentManager"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/widget/cw;->a:Lorg/c/b;

    return-void
.end method


# virtual methods
.method public final a(Landroid/support/v4/app/Fragment;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 307
    if-eqz p1, :cond_3

    .line 308
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getTag()Ljava/lang/String;

    move-result-object v1

    .line 309
    iget-object v0, p0, Lkik/android/widget/cw;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/widget/cw$a;

    .line 310
    if-eqz v0, :cond_0

    invoke-static {v0}, Lkik/android/widget/cw$a;->b(Lkik/android/widget/cw$a;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v0}, Lkik/android/widget/cw$a;->b(Lkik/android/widget/cw$a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 311
    invoke-virtual {v0}, Lkik/android/widget/cw$a;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 312
    iget-object v0, p0, Lkik/android/widget/cw;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/widget/cw$a;

    invoke-virtual {v0}, Lkik/android/widget/cw$a;->a()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, Lkik/android/widget/cw;->b:Landroid/support/v4/app/FragmentManager;

    invoke-static {v0}, Lkik/android/widget/cw$a;->b(Lkik/android/widget/cw$a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, v5}, Landroid/support/v4/app/FragmentManager;->popBackStack(Ljava/lang/String;I)V

    goto :goto_1

    .line 316
    :cond_2
    iget-object v0, p0, Lkik/android/widget/cw;->b:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0, v1, v5}, Landroid/support/v4/app/FragmentManager;->popBackStack(Ljava/lang/String;I)V

    goto :goto_0

    .line 321
    :cond_3
    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 54
    invoke-static {p1}, Lcom/kik/cards/util/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 56
    iget v0, p0, Lkik/android/widget/cw;->f:I

    iget v4, p0, Lkik/android/widget/cw;->c:I

    if-ge v0, v4, :cond_0

    move v0, v2

    :goto_0
    if-nez v0, :cond_1

    move v0, v1

    .line 69
    :goto_1
    return v0

    :cond_0
    move v0, v1

    .line 56
    goto :goto_0

    .line 59
    :cond_1
    if-eqz v3, :cond_2

    iget-object v0, p0, Lkik/android/widget/cw;->e:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    .line 61
    goto :goto_1

    .line 64
    :cond_2
    iget-object v0, p0, Lkik/android/widget/cw;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/widget/cw$a;

    .line 65
    if-eqz v0, :cond_3

    if-eqz v3, :cond_3

    invoke-static {v0}, Lkik/android/widget/cw$a;->a(Lkik/android/widget/cw$a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    .line 66
    goto :goto_1

    :cond_4
    move v0, v2

    .line 69
    goto :goto_1
.end method

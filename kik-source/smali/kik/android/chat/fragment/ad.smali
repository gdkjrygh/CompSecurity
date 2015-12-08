.class public abstract Lkik/android/chat/fragment/ad;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/ad$a;,
        Lkik/android/chat/fragment/ad$b;
    }
.end annotation


# instance fields
.field protected a:Lcom/kik/cache/ad;

.field protected b:I

.field protected c:I


# direct methods
.method public constructor <init>(Lcom/kik/cache/ad;II)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 21
    const/4 v0, 0x1

    iput v0, p0, Lkik/android/chat/fragment/ad;->b:I

    .line 26
    iput-object p1, p0, Lkik/android/chat/fragment/ad;->a:Lcom/kik/cache/ad;

    .line 27
    iput p2, p0, Lkik/android/chat/fragment/ad;->b:I

    .line 28
    iput p3, p0, Lkik/android/chat/fragment/ad;->c:I

    .line 29
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 99
    invoke-virtual {p0}, Lkik/android/chat/fragment/ad;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/ad;->b()Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_1
    add-int/2addr v0, v1

    return v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method protected final a(II)V
    .locals 0

    .prologue
    .line 67
    iput p1, p0, Lkik/android/chat/fragment/ad;->b:I

    .line 68
    iput p2, p0, Lkik/android/chat/fragment/ad;->c:I

    .line 69
    invoke-virtual {p0}, Lkik/android/chat/fragment/ad;->notifyDataSetChanged()V

    .line 70
    return-void
.end method

.method public areAllItemsEnabled()Z
    .locals 1

    .prologue
    .line 81
    const/4 v0, 0x0

    return v0
.end method

.method protected abstract b()Z
.end method

.method protected abstract c()Z
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 75
    int-to-long v0, p1

    return-wide v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 94
    const/4 v0, 0x0

    return v0
.end method

.method public isEnabled(I)Z
    .locals 1

    .prologue
    .line 87
    const/4 v0, 0x0

    return v0
.end method

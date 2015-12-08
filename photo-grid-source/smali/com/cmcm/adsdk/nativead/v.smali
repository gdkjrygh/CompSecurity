.class public final Lcom/cmcm/adsdk/nativead/v;
.super Lcom/cmcm/adsdk/nativead/d;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field private final c:J

.field private d:Lcom/mopub/nativeads/NativeResponse;

.field private e:Landroid/view/View;

.field private f:J


# direct methods
.method public constructor <init>(Lcom/mopub/nativeads/NativeResponse;)V
    .locals 2

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/d;-><init>()V

    .line 17
    const-wide/32 v0, 0x36ee80

    iput-wide v0, p0, Lcom/cmcm/adsdk/nativead/v;->c:J

    .line 22
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/v;->d:Lcom/mopub/nativeads/NativeResponse;

    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/cmcm/adsdk/nativead/v;->f:J

    .line 24
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 117
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/v;->e:Landroid/view/View;

    .line 119
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/v;->d:Lcom/mopub/nativeads/NativeResponse;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/NativeResponse;->recordImpression(Landroid/view/View;)V

    .line 123
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/v;->e:Landroid/view/View;

    .line 1128
    if-eqz v0, :cond_0

    .line 1131
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1132
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1133
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    .line 1134
    check-cast v0, Landroid/view/ViewGroup;

    .line 1135
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 1136
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1137
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1138
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1135
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 124
    :cond_0
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    const-string v0, "mp"

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/v;->d:Lcom/mopub/nativeads/NativeResponse;

    if-eqz v0, :cond_0

    .line 35
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/v;->d:Lcom/mopub/nativeads/NativeResponse;

    invoke-virtual {v0}, Lcom/mopub/nativeads/NativeResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    .line 37
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/v;->d:Lcom/mopub/nativeads/NativeResponse;

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/v;->d:Lcom/mopub/nativeads/NativeResponse;

    invoke-virtual {v0}, Lcom/mopub/nativeads/NativeResponse;->getMainImageUrl()Ljava/lang/String;

    move-result-object v0

    .line 45
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/v;->d:Lcom/mopub/nativeads/NativeResponse;

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/v;->d:Lcom/mopub/nativeads/NativeResponse;

    invoke-virtual {v0}, Lcom/mopub/nativeads/NativeResponse;->getIconImageUrl()Ljava/lang/String;

    move-result-object v0

    .line 58
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/v;->d:Lcom/mopub/nativeads/NativeResponse;

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/v;->d:Lcom/mopub/nativeads/NativeResponse;

    invoke-virtual {v0}, Lcom/mopub/nativeads/NativeResponse;->getCallToAction()Ljava/lang/String;

    move-result-object v0

    .line 79
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/v;->d:Lcom/mopub/nativeads/NativeResponse;

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/v;->d:Lcom/mopub/nativeads/NativeResponse;

    invoke-virtual {v0}, Lcom/mopub/nativeads/NativeResponse;->getText()Ljava/lang/String;

    move-result-object v0

    .line 87
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public final i()Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 171
    invoke-static {}, Lcom/cmcm/adsdk/a;->h()J

    move-result-wide v2

    .line 172
    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-nez v4, :cond_2

    .line 173
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/cmcm/adsdk/nativead/v;->f:J

    sub-long/2addr v2, v4

    const-wide/32 v4, 0x36ee80

    cmp-long v2, v2, v4

    if-ltz v2, :cond_1

    .line 175
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    .line 173
    goto :goto_0

    .line 175
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/cmcm/adsdk/nativead/v;->f:J

    sub-long/2addr v4, v6

    cmp-long v2, v4, v2

    if-gez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final j()Z
    .locals 1

    .prologue
    .line 181
    const/4 v0, 0x1

    return v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/v;->d:Lcom/mopub/nativeads/NativeResponse;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/NativeResponse;->handleClick(Landroid/view/View;)V

    .line 196
    return-void
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 200
    const/4 v0, 0x0

    return v0
.end method

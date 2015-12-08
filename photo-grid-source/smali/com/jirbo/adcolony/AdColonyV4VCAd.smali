.class public final Lcom/jirbo/adcolony/AdColonyV4VCAd;
.super Lcom/jirbo/adcolony/AdColonyAd;
.source "SourceFile"


# instance fields
.field v:Lcom/jirbo/adcolony/AdColonyAdListener;

.field w:Z

.field x:Z

.field y:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 29
    invoke-direct {p0}, Lcom/jirbo/adcolony/AdColonyAd;-><init>()V

    .line 24
    iput-boolean v1, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->w:Z

    .line 25
    iput-boolean v1, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->x:Z

    .line 30
    sput-boolean v1, Lcom/jirbo/adcolony/a;->u:Z

    .line 31
    invoke-static {}, Lcom/jirbo/adcolony/a;->e()V

    .line 32
    const-string v0, "v4vc"

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->j:Ljava/lang/String;

    .line 33
    iput-boolean v1, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->y:Z

    .line 34
    const-string v0, "fullscreen"

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->k:Ljava/lang/String;

    .line 35
    invoke-static {}, Lcom/jirbo/adcolony/ab;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->l:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 39
    invoke-direct {p0}, Lcom/jirbo/adcolony/AdColonyAd;-><init>()V

    .line 24
    iput-boolean v1, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->w:Z

    .line 25
    iput-boolean v1, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->x:Z

    .line 40
    invoke-static {}, Lcom/jirbo/adcolony/a;->e()V

    .line 41
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->g:Ljava/lang/String;

    .line 42
    const-string v0, "v4vc"

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->j:Ljava/lang/String;

    .line 43
    iput-boolean v1, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->y:Z

    .line 44
    const-string v0, "fullscreen"

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->k:Ljava/lang/String;

    .line 45
    invoke-static {}, Lcom/jirbo/adcolony/ab;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->l:Ljava/lang/String;

    .line 46
    return-void
.end method


# virtual methods
.method final a()V
    .locals 2

    .prologue
    .line 198
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->f:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 200
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->x:Z

    if-eqz v0, :cond_0

    const-string v0, "Result"

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->a(Ljava/lang/String;)V

    .line 202
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    invoke-interface {v0, p0}, Lcom/jirbo/adcolony/AdColonyAdListener;->onAdColonyAdAttemptFinished(Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 203
    :cond_1
    invoke-static {}, Lcom/jirbo/adcolony/a;->h()V

    .line 206
    sget-boolean v0, Lcom/jirbo/adcolony/a;->u:Z

    if-nez v0, :cond_3

    sget-boolean v0, Lcom/jirbo/adcolony/AdColonyBrowser;->B:Z

    if-nez v0, :cond_3

    .line 208
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 209
    :cond_2
    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 212
    :cond_3
    const/4 v0, 0x0

    sput-object v0, Lcom/jirbo/adcolony/a;->K:Lcom/jirbo/adcolony/ADCVideo;

    .line 213
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->x:Z

    if-nez v0, :cond_4

    const/4 v0, 0x1

    sput-boolean v0, Lcom/jirbo/adcolony/a;->v:Z

    .line 214
    :cond_4
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 215
    return-void
.end method

.method final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 219
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->getRewardName()Ljava/lang/String;

    move-result-object v0

    .line 222
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->getRewardAmount()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 224
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 226
    const-string v1, "Confirmation"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/jirbo/adcolony/ac;

    invoke-direct {v1, v0, p0}, Lcom/jirbo/adcolony/ac;-><init>(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyV4VCAd;)V

    sput-object v1, Lcom/jirbo/adcolony/a;->I:Lcom/jirbo/adcolony/h;

    .line 229
    :goto_0
    return-void

    .line 227
    :cond_0
    new-instance v1, Lcom/jirbo/adcolony/ad;

    invoke-direct {v1, v0, p0}, Lcom/jirbo/adcolony/ad;-><init>(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyV4VCAd;)V

    sput-object v1, Lcom/jirbo/adcolony/a;->I:Lcom/jirbo/adcolony/h;

    goto :goto_0
.end method

.method final a(Z)Z
    .locals 1

    .prologue
    .line 80
    const/4 v0, 0x0

    return v0
.end method

.method final b()Z
    .locals 1

    .prologue
    .line 77
    const/4 v0, 0x1

    return v0
.end method

.method final c(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 171
    if-eqz p1, :cond_3

    .line 173
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-virtual {v0, p0}, Lcom/jirbo/adcolony/d;->b(Lcom/jirbo/adcolony/AdColonyV4VCAd;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 175
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    invoke-interface {v0, p0}, Lcom/jirbo/adcolony/AdColonyAdListener;->onAdColonyAdStarted(Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 176
    :cond_0
    iput v1, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->f:I

    .line 190
    :goto_0
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->f:I

    if-eq v0, v1, :cond_1

    .line 192
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    invoke-interface {v0, p0}, Lcom/jirbo/adcolony/AdColonyAdListener;->onAdColonyAdAttemptFinished(Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 194
    :cond_1
    return-void

    .line 180
    :cond_2
    const/4 v0, 0x3

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->f:I

    goto :goto_0

    .line 185
    :cond_3
    const/4 v0, 0x1

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->f:I

    goto :goto_0
.end method

.method public final getRemainingViewsUntilReward()I
    .locals 3

    .prologue
    .line 116
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 119
    :goto_0
    return v0

    .line 117
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$ab;->j:Lcom/jirbo/adcolony/n$ad;

    iget v0, v0, Lcom/jirbo/adcolony/n$ad;->f:I

    .line 118
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$ab;->j:Lcom/jirbo/adcolony/n$ad;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$ad;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/d;->e(Ljava/lang/String;)I

    move-result v1

    .line 119
    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method public final getRewardAmount()I
    .locals 1

    .prologue
    .line 104
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 105
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$ab;->j:Lcom/jirbo/adcolony/n$ad;

    iget v0, v0, Lcom/jirbo/adcolony/n$ad;->c:I

    goto :goto_0
.end method

.method public final getRewardName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 98
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    .line 99
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$ab;->j:Lcom/jirbo/adcolony/n$ad;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$ad;->d:Ljava/lang/String;

    goto :goto_0
.end method

.method public final getViewsPerReward()I
    .locals 1

    .prologue
    .line 110
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 111
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$ab;->j:Lcom/jirbo/adcolony/n$ad;

    iget v0, v0, Lcom/jirbo/adcolony/n$ad;->f:I

    goto :goto_0
.end method

.method public final isReady()Z
    .locals 2

    .prologue
    .line 84
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 86
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/d;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->g:Ljava/lang/String;

    .line 87
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 89
    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/d;->g(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method public final show()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 127
    sput v2, Lcom/jirbo/adcolony/a;->ac:I

    .line 128
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->y:Z

    if-eqz v0, :cond_1

    .line 130
    sget-object v0, Lcom/jirbo/adcolony/l;->d:Lcom/jirbo/adcolony/l;

    const-string v1, "Show attempt on out of date ad object. Please instantiate a new ad object for each ad attempt."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 167
    :cond_0
    :goto_0
    return-void

    .line 133
    :cond_1
    iput-boolean v3, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->y:Z

    .line 134
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->isReady()Z

    move-result v0

    if-nez v0, :cond_2

    .line 137
    new-instance v0, Lcom/jirbo/adcolony/AdColonyV4VCAd$1;

    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-direct {v0, p0, v1}, Lcom/jirbo/adcolony/AdColonyV4VCAd$1;-><init>(Lcom/jirbo/adcolony/AdColonyV4VCAd;Lcom/jirbo/adcolony/d;)V

    .line 144
    const/4 v0, 0x2

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->f:I

    .line 145
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    invoke-interface {v0, p0}, Lcom/jirbo/adcolony/AdColonyAdListener;->onAdColonyAdAttemptFinished(Lcom/jirbo/adcolony/AdColonyAd;)V

    goto :goto_0

    .line 148
    :cond_2
    sget-boolean v0, Lcom/jirbo/adcolony/a;->v:Z

    if-eqz v0, :cond_0

    .line 151
    new-instance v0, Lcom/jirbo/adcolony/AdColonyV4VCAd$2;

    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-direct {v0, p0, v1}, Lcom/jirbo/adcolony/AdColonyV4VCAd$2;-><init>(Lcom/jirbo/adcolony/AdColonyV4VCAd;Lcom/jirbo/adcolony/d;)V

    .line 158
    sput-boolean v2, Lcom/jirbo/adcolony/a;->v:Z

    .line 159
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->c()Z

    .line 161
    sput-object p0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    .line 162
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-virtual {v0, p0}, Lcom/jirbo/adcolony/d;->a(Lcom/jirbo/adcolony/AdColonyV4VCAd;)V

    .line 164
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->w:Z

    if-eqz v0, :cond_3

    const-string v0, "Confirmation"

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 165
    :cond_3
    invoke-virtual {p0, v3}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->c(Z)V

    goto :goto_0
.end method

.method public final withConfirmationDialog()Lcom/jirbo/adcolony/AdColonyV4VCAd;
    .locals 1

    .prologue
    .line 69
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->withConfirmationDialog(Z)Lcom/jirbo/adcolony/AdColonyV4VCAd;

    move-result-object v0

    return-object v0
.end method

.method public final withConfirmationDialog(Z)Lcom/jirbo/adcolony/AdColonyV4VCAd;
    .locals 0

    .prologue
    .line 56
    iput-boolean p1, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->w:Z

    .line 57
    return-object p0
.end method

.method public final withListener(Lcom/jirbo/adcolony/AdColonyAdListener;)Lcom/jirbo/adcolony/AdColonyV4VCAd;
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    .line 51
    return-object p0
.end method

.method public final withResultsDialog()Lcom/jirbo/adcolony/AdColonyV4VCAd;
    .locals 1

    .prologue
    .line 74
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->withResultsDialog(Z)Lcom/jirbo/adcolony/AdColonyV4VCAd;

    move-result-object v0

    return-object v0
.end method

.method public final withResultsDialog(Z)Lcom/jirbo/adcolony/AdColonyV4VCAd;
    .locals 1

    .prologue
    .line 62
    iput-boolean p1, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->x:Z

    .line 63
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCAd;->x:Z

    sput-boolean v0, Lcom/jirbo/adcolony/a;->u:Z

    .line 64
    return-object p0
.end method

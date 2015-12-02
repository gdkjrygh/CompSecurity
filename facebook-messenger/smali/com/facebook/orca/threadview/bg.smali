.class synthetic Lcom/facebook/orca/threadview/bg;
.super Ljava/lang/Object;
.source "ThreadViewAudioAttachmentView.java"


# static fields
.field static final synthetic a:[I

.field static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 246
    invoke-static {}, Lcom/facebook/orca/threadview/bh;->values()[Lcom/facebook/orca/threadview/bh;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/facebook/orca/threadview/bg;->b:[I

    :try_start_0
    sget-object v0, Lcom/facebook/orca/threadview/bg;->b:[I

    sget-object v1, Lcom/facebook/orca/threadview/bh;->DOWNLOADED:Lcom/facebook/orca/threadview/bh;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/bh;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_6

    :goto_0
    :try_start_1
    sget-object v0, Lcom/facebook/orca/threadview/bg;->b:[I

    sget-object v1, Lcom/facebook/orca/threadview/bh;->ERROR:Lcom/facebook/orca/threadview/bh;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/bh;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_5

    .line 68
    :goto_1
    invoke-static {}, Lcom/facebook/orca/d/k;->values()[Lcom/facebook/orca/d/k;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/facebook/orca/threadview/bg;->a:[I

    :try_start_2
    sget-object v0, Lcom/facebook/orca/threadview/bg;->a:[I

    sget-object v1, Lcom/facebook/orca/d/k;->PLAYBACK_STARTED:Lcom/facebook/orca/d/k;

    invoke-virtual {v1}, Lcom/facebook/orca/d/k;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_4

    :goto_2
    :try_start_3
    sget-object v0, Lcom/facebook/orca/threadview/bg;->a:[I

    sget-object v1, Lcom/facebook/orca/d/k;->PLAYBACK_POSITION_UPDATED:Lcom/facebook/orca/d/k;

    invoke-virtual {v1}, Lcom/facebook/orca/d/k;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :goto_3
    :try_start_4
    sget-object v0, Lcom/facebook/orca/threadview/bg;->a:[I

    sget-object v1, Lcom/facebook/orca/d/k;->PLAYBACK_COMPLETED:Lcom/facebook/orca/d/k;

    invoke-virtual {v1}, Lcom/facebook/orca/d/k;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_2

    :goto_4
    :try_start_5
    sget-object v0, Lcom/facebook/orca/threadview/bg;->a:[I

    sget-object v1, Lcom/facebook/orca/d/k;->PLAYBACK_ERROR:Lcom/facebook/orca/d/k;

    invoke-virtual {v1}, Lcom/facebook/orca/d/k;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_1

    :goto_5
    :try_start_6
    sget-object v0, Lcom/facebook/orca/threadview/bg;->a:[I

    sget-object v1, Lcom/facebook/orca/d/k;->PLAYBACK_STOPPED:Lcom/facebook/orca/d/k;

    invoke-virtual {v1}, Lcom/facebook/orca/d/k;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_0

    :goto_6
    return-void

    :catch_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v0

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v0

    goto :goto_2

    .line 246
    :catch_5
    move-exception v0

    goto :goto_1

    :catch_6
    move-exception v0

    goto :goto_0
.end method

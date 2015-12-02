.class synthetic Lcom/qihoo/security/v7/MaterialMenuDrawable$5;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/v7/MaterialMenuDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic a:[I

.field static final synthetic b:[I

.field static final synthetic c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 630
    invoke-static {}, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->values()[Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->c:[I

    :try_start_0
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->c:[I

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->BURGER:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_c

    :goto_0
    :try_start_1
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->c:[I

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_b

    :goto_1
    :try_start_2
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->c:[I

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->X:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_a

    :goto_2
    :try_start_3
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->c:[I

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_9

    .line 559
    :goto_3
    invoke-static {}, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->values()[Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->b:[I

    :try_start_4
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->b:[I

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->REGULAR:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_8

    :goto_4
    :try_start_5
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->b:[I

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->THIN:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_7

    :goto_5
    :try_start_6
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->b:[I

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->EXTRA_THIN:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 32
    :goto_6
    invoke-static {}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->values()[Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->a:[I

    :try_start_7
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->a:[I

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_5

    :goto_7
    :try_start_8
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->a:[I

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_X:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_4

    :goto_8
    :try_start_9
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->a:[I

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ARROW_X:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_3

    :goto_9
    :try_start_a
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->a:[I

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ARROW_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_2

    :goto_a
    :try_start_b
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->a:[I

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_1

    :goto_b
    :try_start_c
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->a:[I

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->X_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_0

    :goto_c
    return-void

    :catch_0
    move-exception v0

    goto :goto_c

    :catch_1
    move-exception v0

    goto :goto_b

    :catch_2
    move-exception v0

    goto :goto_a

    :catch_3
    move-exception v0

    goto :goto_9

    :catch_4
    move-exception v0

    goto :goto_8

    :catch_5
    move-exception v0

    goto :goto_7

    .line 559
    :catch_6
    move-exception v0

    goto :goto_6

    :catch_7
    move-exception v0

    goto :goto_5

    :catch_8
    move-exception v0

    goto :goto_4

    .line 630
    :catch_9
    move-exception v0

    goto/16 :goto_3

    :catch_a
    move-exception v0

    goto/16 :goto_2

    :catch_b
    move-exception v0

    goto/16 :goto_1

    :catch_c
    move-exception v0

    goto/16 :goto_0
.end method

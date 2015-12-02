.class public Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/a$a;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 336
    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a:Ljava/lang/String;

    .line 405
    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->b:Ljava/lang/String;

    return-void
.end method

.method public static a(F)I
    .locals 6

    .prologue
    const/16 v3, 0xa

    const/16 v5, 0x1f4

    const/16 v2, 0x14

    const/16 v0, 0x64

    const/16 v4, 0x32

    .line 37
    .line 39
    const/high16 v1, 0x49800000    # 1048576.0f

    div-float v1, p0, v1

    float-to-int v1, v1

    .line 41
    if-ge v1, v3, :cond_1

    .line 42
    const/16 v0, 0xf

    .line 65
    :cond_0
    :goto_0
    return v0

    .line 45
    :cond_1
    if-ge v1, v2, :cond_2

    .line 46
    const/16 v0, 0xf

    invoke-static {v1, v0, v4, v3, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(IIIII)I

    move-result v0

    goto :goto_0

    .line 49
    :cond_2
    if-ge v1, v4, :cond_3

    .line 50
    const/16 v0, 0x41

    invoke-static {v1, v4, v0, v2, v4}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(IIIII)I

    move-result v0

    goto :goto_0

    .line 53
    :cond_3
    if-ge v1, v0, :cond_4

    .line 54
    const/16 v2, 0x41

    const/16 v3, 0x50

    invoke-static {v1, v2, v3, v4, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(IIIII)I

    move-result v0

    goto :goto_0

    .line 57
    :cond_4
    if-ge v1, v5, :cond_5

    .line 58
    const/16 v2, 0x50

    const/16 v3, 0x5a

    invoke-static {v1, v2, v3, v0, v5}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(IIIII)I

    move-result v0

    goto :goto_0

    .line 61
    :cond_5
    const/16 v2, 0x400

    if-ge v1, v2, :cond_0

    .line 62
    const/16 v2, 0x5a

    const/16 v3, 0x400

    invoke-static {v1, v2, v0, v5, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(IIIII)I

    move-result v0

    goto :goto_0
.end method

.method private static a(IIIII)I
    .locals 2

    .prologue
    .line 69
    sub-int v0, p2, p1

    sub-int v1, p0, p3

    mul-int/2addr v0, v1

    sub-int v1, p4, p3

    div-int/2addr v0, v1

    add-int/2addr v0, p1

    return v0
.end method

.method public static a(I)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;
    .locals 1

    .prologue
    .line 179
    const/16 v0, 0x50

    if-lt p0, v0, :cond_0

    .line 181
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 188
    :goto_0
    return-object v0

    .line 184
    :cond_0
    const/16 v0, 0x32

    if-ge p0, v0, :cond_1

    .line 185
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    goto :goto_0

    .line 188
    :cond_1
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    goto :goto_0
.end method

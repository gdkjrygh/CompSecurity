.class public final enum Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/exam/ExamMainAnim;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ExamStatus"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

.field public static final enum IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

.field public static final enum NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

.field private static final synthetic b:[Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 12
    new-instance v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    const-string/jumbo v1, "IN_DANGER"

    invoke-direct {v0, v1, v2, v4}, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 13
    new-instance v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    const-string/jumbo v1, "NEED_OPTIMIZE"

    invoke-direct {v0, v1, v3, v3}, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 14
    new-instance v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    const-string/jumbo v1, "EXCELLENT"

    invoke-direct {v0, v1, v4, v2}, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 11
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    aput-object v1, v0, v4

    sput-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->b:[Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .prologue
    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 18
    iput p3, p0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->a:I

    .line 19
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;
    .locals 1

    .prologue
    .line 11
    const-class v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;
    .locals 1

    .prologue
    .line 11
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->b:[Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v0}, [Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    return-object v0
.end method


# virtual methods
.method public getLevel()I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->a:I

    return v0
.end method

.method public getStatusWithLevel(I)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;
    .locals 1

    .prologue
    .line 26
    packed-switch p1, :pswitch_data_0

    .line 34
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    :goto_0
    return-object v0

    .line 28
    :pswitch_0
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    goto :goto_0

    .line 30
    :pswitch_1
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    goto :goto_0

    .line 32
    :pswitch_2
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    goto :goto_0

    .line 26
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

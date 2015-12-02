.class public final enum Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/adv/AdvDataManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AdvReportType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum Click:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

.field public static final enum Install:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

.field public static final enum LaunchApp:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

.field public static final enum Request:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

.field public static final enum Show:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

.field private static final synthetic b:[Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 290
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    const-string/jumbo v1, "Request"

    invoke-direct {v0, v1, v7, v3}, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Request:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    const-string/jumbo v1, "Show"

    invoke-direct {v0, v1, v3, v4}, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Show:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    const-string/jumbo v1, "Click"

    invoke-direct {v0, v1, v4, v5}, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Click:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    const-string/jumbo v1, "Install"

    invoke-direct {v0, v1, v5, v6}, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Install:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    const-string/jumbo v1, "LaunchApp"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v6, v2}, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->LaunchApp:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    .line 289
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Request:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Show:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Click:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Install:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->LaunchApp:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    aput-object v1, v0, v6

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->b:[Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

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
    .line 293
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 294
    iput p3, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->a:I

    .line 295
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;
    .locals 1

    .prologue
    .line 289
    const-class v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;
    .locals 1

    .prologue
    .line 289
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->b:[Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    invoke-virtual {v0}, [Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    return-object v0
.end method


# virtual methods
.method public getType()I
    .locals 1

    .prologue
    .line 298
    iget v0, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->a:I

    return v0
.end method

.method public setType(I)V
    .locals 0

    .prologue
    .line 302
    iput p1, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->a:I

    .line 303
    return-void
.end method

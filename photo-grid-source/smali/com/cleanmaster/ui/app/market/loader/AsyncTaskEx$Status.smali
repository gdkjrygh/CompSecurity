.class public final enum Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum FINISHED:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

.field public static final enum PENDING:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

.field public static final enum RUNNING:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

.field private static final synthetic a:[Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 207
    new-instance v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    const-string v1, "PENDING"

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;->PENDING:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    .line 211
    new-instance v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    const-string v1, "RUNNING"

    invoke-direct {v0, v1, v3}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;->RUNNING:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    .line 215
    new-instance v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    const-string v1, "FINISHED"

    invoke-direct {v0, v1, v4}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;->FINISHED:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    .line 203
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    sget-object v1, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;->PENDING:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    aput-object v1, v0, v2

    sget-object v1, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;->RUNNING:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    aput-object v1, v0, v3

    sget-object v1, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;->FINISHED:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    aput-object v1, v0, v4

    sput-object v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;->a:[Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 203
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;
    .locals 1

    .prologue
    .line 203
    const-class v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    return-object v0
.end method

.method public static values()[Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;
    .locals 1

    .prologue
    .line 203
    sget-object v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;->a:[Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    invoke-virtual {v0}, [Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    return-object v0
.end method

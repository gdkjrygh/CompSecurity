.class public final enum Lcom/facebook/AsyncTask$Status;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/AsyncTask$Status;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/AsyncTask$Status;

.field public static final enum FINISHED:Lcom/facebook/AsyncTask$Status;

.field public static final enum PENDING:Lcom/facebook/AsyncTask$Status;

.field public static final enum RUNNING:Lcom/facebook/AsyncTask$Status;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 288
    new-instance v0, Lcom/facebook/AsyncTask$Status;

    const-string v1, "PENDING"

    invoke-direct {v0, v1, v2}, Lcom/facebook/AsyncTask$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/AsyncTask$Status;->PENDING:Lcom/facebook/AsyncTask$Status;

    .line 292
    new-instance v0, Lcom/facebook/AsyncTask$Status;

    const-string v1, "RUNNING"

    invoke-direct {v0, v1, v3}, Lcom/facebook/AsyncTask$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/AsyncTask$Status;->RUNNING:Lcom/facebook/AsyncTask$Status;

    .line 296
    new-instance v0, Lcom/facebook/AsyncTask$Status;

    const-string v1, "FINISHED"

    invoke-direct {v0, v1, v4}, Lcom/facebook/AsyncTask$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/AsyncTask$Status;->FINISHED:Lcom/facebook/AsyncTask$Status;

    .line 284
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/AsyncTask$Status;

    sget-object v1, Lcom/facebook/AsyncTask$Status;->PENDING:Lcom/facebook/AsyncTask$Status;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/AsyncTask$Status;->RUNNING:Lcom/facebook/AsyncTask$Status;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/AsyncTask$Status;->FINISHED:Lcom/facebook/AsyncTask$Status;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/AsyncTask$Status;->$VALUES:[Lcom/facebook/AsyncTask$Status;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 284
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/AsyncTask$Status;
    .locals 1

    .prologue
    .line 284
    const-class v0, Lcom/facebook/AsyncTask$Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/AsyncTask$Status;

    return-object v0
.end method

.method public static values()[Lcom/facebook/AsyncTask$Status;
    .locals 1

    .prologue
    .line 284
    sget-object v0, Lcom/facebook/AsyncTask$Status;->$VALUES:[Lcom/facebook/AsyncTask$Status;

    invoke-virtual {v0}, [Lcom/facebook/AsyncTask$Status;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/AsyncTask$Status;

    return-object v0
.end method

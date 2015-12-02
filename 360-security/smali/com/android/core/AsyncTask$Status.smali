.class public final enum Lcom/android/core/AsyncTask$Status;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/core/AsyncTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Status"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/android/core/AsyncTask$Status;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum FINISHED:Lcom/android/core/AsyncTask$Status;

.field public static final enum PENDING:Lcom/android/core/AsyncTask$Status;

.field public static final enum RUNNING:Lcom/android/core/AsyncTask$Status;

.field private static final synthetic a:[Lcom/android/core/AsyncTask$Status;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 244
    new-instance v0, Lcom/android/core/AsyncTask$Status;

    const-string/jumbo v1, "PENDING"

    invoke-direct {v0, v1, v2}, Lcom/android/core/AsyncTask$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/android/core/AsyncTask$Status;->PENDING:Lcom/android/core/AsyncTask$Status;

    .line 248
    new-instance v0, Lcom/android/core/AsyncTask$Status;

    const-string/jumbo v1, "RUNNING"

    invoke-direct {v0, v1, v3}, Lcom/android/core/AsyncTask$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/android/core/AsyncTask$Status;->RUNNING:Lcom/android/core/AsyncTask$Status;

    .line 252
    new-instance v0, Lcom/android/core/AsyncTask$Status;

    const-string/jumbo v1, "FINISHED"

    invoke-direct {v0, v1, v4}, Lcom/android/core/AsyncTask$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/android/core/AsyncTask$Status;->FINISHED:Lcom/android/core/AsyncTask$Status;

    .line 240
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/android/core/AsyncTask$Status;

    sget-object v1, Lcom/android/core/AsyncTask$Status;->PENDING:Lcom/android/core/AsyncTask$Status;

    aput-object v1, v0, v2

    sget-object v1, Lcom/android/core/AsyncTask$Status;->RUNNING:Lcom/android/core/AsyncTask$Status;

    aput-object v1, v0, v3

    sget-object v1, Lcom/android/core/AsyncTask$Status;->FINISHED:Lcom/android/core/AsyncTask$Status;

    aput-object v1, v0, v4

    sput-object v0, Lcom/android/core/AsyncTask$Status;->a:[Lcom/android/core/AsyncTask$Status;

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
    .line 240
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/android/core/AsyncTask$Status;
    .locals 1

    .prologue
    .line 240
    const-class v0, Lcom/android/core/AsyncTask$Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/android/core/AsyncTask$Status;

    return-object v0
.end method

.method public static values()[Lcom/android/core/AsyncTask$Status;
    .locals 1

    .prologue
    .line 240
    sget-object v0, Lcom/android/core/AsyncTask$Status;->a:[Lcom/android/core/AsyncTask$Status;

    invoke-virtual {v0}, [Lcom/android/core/AsyncTask$Status;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/android/core/AsyncTask$Status;

    return-object v0
.end method

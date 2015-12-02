.class public final enum Lcom/b/a/a/e;
.super Ljava/lang/Enum;
.source "Policy.java"

# interfaces
.implements Lcom/b/a/a/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/b/a/a/e;",
        ">;",
        "Lcom/b/a/a/g;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/b/a/a/e;

.field public static final enum DetectActivityLeaks:Lcom/b/a/a/e;

.field public static final enum DetectAll:Lcom/b/a/a/e;

.field public static final enum DetectLeakedClosableObjects:Lcom/b/a/a/e;

.field public static final enum DetectLeakedRegistrationObjects:Lcom/b/a/a/e;

.field public static final enum DetectLeakedSqlLiteObjects:Lcom/b/a/a/e;

.field public static final enum Lax:Lcom/b/a/a/e;

.field public static final enum PenaltyDeath:Lcom/b/a/a/e;

.field public static final enum PenaltyDropBox:Lcom/b/a/a/e;

.field public static final enum PenaltyLog:Lcom/b/a/a/e;

.field public static final enum Reset:Lcom/b/a/a/e;


# instance fields
.field private final mSetter:Lcom/b/a/a/g;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 87
    new-instance v0, Lcom/b/a/a/e;

    const-string v1, "Lax"

    new-instance v2, Lcom/b/a/a/a/ad;

    invoke-direct {v2}, Lcom/b/a/a/a/ad;-><init>()V

    invoke-direct {v0, v1, v4, v2}, Lcom/b/a/a/e;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/e;->Lax:Lcom/b/a/a/e;

    .line 88
    new-instance v0, Lcom/b/a/a/e;

    const-string v1, "Reset"

    new-instance v2, Lcom/b/a/a/a/ah;

    invoke-direct {v2}, Lcom/b/a/a/a/ah;-><init>()V

    invoke-direct {v0, v1, v5, v2}, Lcom/b/a/a/e;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/e;->Reset:Lcom/b/a/a/e;

    .line 89
    new-instance v0, Lcom/b/a/a/e;

    const-string v1, "DetectAll"

    new-instance v2, Lcom/b/a/a/a/z;

    invoke-direct {v2}, Lcom/b/a/a/a/z;-><init>()V

    invoke-direct {v0, v1, v6, v2}, Lcom/b/a/a/e;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/e;->DetectAll:Lcom/b/a/a/e;

    .line 90
    new-instance v0, Lcom/b/a/a/e;

    const-string v1, "DetectActivityLeaks"

    new-instance v2, Lcom/b/a/a/a/y;

    invoke-direct {v2}, Lcom/b/a/a/a/y;-><init>()V

    invoke-direct {v0, v1, v7, v2}, Lcom/b/a/a/e;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/e;->DetectActivityLeaks:Lcom/b/a/a/e;

    .line 91
    new-instance v0, Lcom/b/a/a/e;

    const-string v1, "DetectLeakedClosableObjects"

    new-instance v2, Lcom/b/a/a/a/aa;

    invoke-direct {v2}, Lcom/b/a/a/a/aa;-><init>()V

    invoke-direct {v0, v1, v8, v2}, Lcom/b/a/a/e;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/e;->DetectLeakedClosableObjects:Lcom/b/a/a/e;

    .line 92
    new-instance v0, Lcom/b/a/a/e;

    const-string v1, "DetectLeakedRegistrationObjects"

    const/4 v2, 0x5

    new-instance v3, Lcom/b/a/a/a/ab;

    invoke-direct {v3}, Lcom/b/a/a/a/ab;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/e;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/e;->DetectLeakedRegistrationObjects:Lcom/b/a/a/e;

    .line 93
    new-instance v0, Lcom/b/a/a/e;

    const-string v1, "DetectLeakedSqlLiteObjects"

    const/4 v2, 0x6

    new-instance v3, Lcom/b/a/a/a/ac;

    invoke-direct {v3}, Lcom/b/a/a/a/ac;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/e;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/e;->DetectLeakedSqlLiteObjects:Lcom/b/a/a/e;

    .line 94
    new-instance v0, Lcom/b/a/a/e;

    const-string v1, "PenaltyDeath"

    const/4 v2, 0x7

    new-instance v3, Lcom/b/a/a/a/ae;

    invoke-direct {v3}, Lcom/b/a/a/a/ae;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/e;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/e;->PenaltyDeath:Lcom/b/a/a/e;

    .line 95
    new-instance v0, Lcom/b/a/a/e;

    const-string v1, "PenaltyDropBox"

    const/16 v2, 0x8

    new-instance v3, Lcom/b/a/a/a/af;

    invoke-direct {v3}, Lcom/b/a/a/a/af;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/e;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/e;->PenaltyDropBox:Lcom/b/a/a/e;

    .line 96
    new-instance v0, Lcom/b/a/a/e;

    const-string v1, "PenaltyLog"

    const/16 v2, 0x9

    new-instance v3, Lcom/b/a/a/a/ag;

    invoke-direct {v3}, Lcom/b/a/a/a/ag;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/e;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/e;->PenaltyLog:Lcom/b/a/a/e;

    .line 86
    const/16 v0, 0xa

    new-array v0, v0, [Lcom/b/a/a/e;

    sget-object v1, Lcom/b/a/a/e;->Lax:Lcom/b/a/a/e;

    aput-object v1, v0, v4

    sget-object v1, Lcom/b/a/a/e;->Reset:Lcom/b/a/a/e;

    aput-object v1, v0, v5

    sget-object v1, Lcom/b/a/a/e;->DetectAll:Lcom/b/a/a/e;

    aput-object v1, v0, v6

    sget-object v1, Lcom/b/a/a/e;->DetectActivityLeaks:Lcom/b/a/a/e;

    aput-object v1, v0, v7

    sget-object v1, Lcom/b/a/a/e;->DetectLeakedClosableObjects:Lcom/b/a/a/e;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/b/a/a/e;->DetectLeakedRegistrationObjects:Lcom/b/a/a/e;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/b/a/a/e;->DetectLeakedSqlLiteObjects:Lcom/b/a/a/e;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/b/a/a/e;->PenaltyDeath:Lcom/b/a/a/e;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/b/a/a/e;->PenaltyDropBox:Lcom/b/a/a/e;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/b/a/a/e;->PenaltyLog:Lcom/b/a/a/e;

    aput-object v2, v0, v1

    sput-object v0, Lcom/b/a/a/e;->$VALUES:[Lcom/b/a/a/e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/b/a/a/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/b/a/a/g;",
            ")V"
        }
    .end annotation

    .prologue
    .line 99
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 100
    iput-object p3, p0, Lcom/b/a/a/e;->mSetter:Lcom/b/a/a/g;

    .line 101
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/b/a/a/e;
    .locals 1

    .prologue
    .line 86
    const-class v0, Lcom/b/a/a/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/b/a/a/e;

    return-object v0
.end method

.method public static values()[Lcom/b/a/a/e;
    .locals 1

    .prologue
    .line 86
    sget-object v0, Lcom/b/a/a/e;->$VALUES:[Lcom/b/a/a/e;

    invoke-virtual {v0}, [Lcom/b/a/a/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/b/a/a/e;

    return-object v0
.end method


# virtual methods
.method public set()V
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/b/a/a/e;->mSetter:Lcom/b/a/a/g;

    invoke-interface {v0}, Lcom/b/a/a/g;->set()V

    .line 106
    return-void
.end method

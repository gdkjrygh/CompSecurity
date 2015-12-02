.class public final enum Lcom/b/a/a/c;
.super Ljava/lang/Enum;
.source "Policy.java"

# interfaces
.implements Lcom/b/a/a/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/b/a/a/c;",
        ">;",
        "Lcom/b/a/a/g;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/b/a/a/c;

.field public static final enum DetectAll:Lcom/b/a/a/c;

.field public static final enum Lax:Lcom/b/a/a/c;

.field public static final enum PenaltyDeath:Lcom/b/a/a/c;

.field public static final enum PenaltyDropBox:Lcom/b/a/a/c;

.field public static final enum PenaltyLog:Lcom/b/a/a/c;

.field public static final enum Reset:Lcom/b/a/a/c;


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

    .line 39
    new-instance v0, Lcom/b/a/a/c;

    const-string v1, "Lax"

    new-instance v2, Lcom/b/a/a/a/b;

    invoke-direct {v2}, Lcom/b/a/a/a/b;-><init>()V

    invoke-direct {v0, v1, v4, v2}, Lcom/b/a/a/c;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/c;->Lax:Lcom/b/a/a/c;

    .line 40
    new-instance v0, Lcom/b/a/a/c;

    const-string v1, "Reset"

    new-instance v2, Lcom/b/a/a/a/f;

    invoke-direct {v2}, Lcom/b/a/a/a/f;-><init>()V

    invoke-direct {v0, v1, v5, v2}, Lcom/b/a/a/c;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/c;->Reset:Lcom/b/a/a/c;

    .line 41
    new-instance v0, Lcom/b/a/a/c;

    const-string v1, "DetectAll"

    new-instance v2, Lcom/b/a/a/a/a;

    invoke-direct {v2}, Lcom/b/a/a/a/a;-><init>()V

    invoke-direct {v0, v1, v6, v2}, Lcom/b/a/a/c;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/c;->DetectAll:Lcom/b/a/a/c;

    .line 42
    new-instance v0, Lcom/b/a/a/c;

    const-string v1, "PenaltyDeath"

    new-instance v2, Lcom/b/a/a/a/c;

    invoke-direct {v2}, Lcom/b/a/a/a/c;-><init>()V

    invoke-direct {v0, v1, v7, v2}, Lcom/b/a/a/c;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/c;->PenaltyDeath:Lcom/b/a/a/c;

    .line 43
    new-instance v0, Lcom/b/a/a/c;

    const-string v1, "PenaltyDropBox"

    new-instance v2, Lcom/b/a/a/a/d;

    invoke-direct {v2}, Lcom/b/a/a/a/d;-><init>()V

    invoke-direct {v0, v1, v8, v2}, Lcom/b/a/a/c;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/c;->PenaltyDropBox:Lcom/b/a/a/c;

    .line 44
    new-instance v0, Lcom/b/a/a/c;

    const-string v1, "PenaltyLog"

    const/4 v2, 0x5

    new-instance v3, Lcom/b/a/a/a/e;

    invoke-direct {v3}, Lcom/b/a/a/a/e;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/c;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/c;->PenaltyLog:Lcom/b/a/a/c;

    .line 38
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/b/a/a/c;

    sget-object v1, Lcom/b/a/a/c;->Lax:Lcom/b/a/a/c;

    aput-object v1, v0, v4

    sget-object v1, Lcom/b/a/a/c;->Reset:Lcom/b/a/a/c;

    aput-object v1, v0, v5

    sget-object v1, Lcom/b/a/a/c;->DetectAll:Lcom/b/a/a/c;

    aput-object v1, v0, v6

    sget-object v1, Lcom/b/a/a/c;->PenaltyDeath:Lcom/b/a/a/c;

    aput-object v1, v0, v7

    sget-object v1, Lcom/b/a/a/c;->PenaltyDropBox:Lcom/b/a/a/c;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/b/a/a/c;->PenaltyLog:Lcom/b/a/a/c;

    aput-object v2, v0, v1

    sput-object v0, Lcom/b/a/a/c;->$VALUES:[Lcom/b/a/a/c;

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
    .line 47
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 48
    iput-object p3, p0, Lcom/b/a/a/c;->mSetter:Lcom/b/a/a/g;

    .line 49
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/b/a/a/c;
    .locals 1

    .prologue
    .line 38
    const-class v0, Lcom/b/a/a/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/b/a/a/c;

    return-object v0
.end method

.method public static values()[Lcom/b/a/a/c;
    .locals 1

    .prologue
    .line 38
    sget-object v0, Lcom/b/a/a/c;->$VALUES:[Lcom/b/a/a/c;

    invoke-virtual {v0}, [Lcom/b/a/a/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/b/a/a/c;

    return-object v0
.end method


# virtual methods
.method public set()V
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/b/a/a/c;->mSetter:Lcom/b/a/a/g;

    invoke-interface {v0}, Lcom/b/a/a/g;->set()V

    .line 54
    return-void
.end method

.class public final enum Lcom/b/a/a/d;
.super Ljava/lang/Enum;
.source "Policy.java"

# interfaces
.implements Lcom/b/a/a/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/b/a/a/d;",
        ">;",
        "Lcom/b/a/a/g;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/b/a/a/d;

.field public static final enum DetectAll:Lcom/b/a/a/d;

.field public static final enum DetectCustomSlowCalls:Lcom/b/a/a/d;

.field public static final enum DetectDisk:Lcom/b/a/a/d;

.field public static final enum DetectNetwork:Lcom/b/a/a/d;

.field public static final enum Lax:Lcom/b/a/a/d;

.field public static final enum PenaltyDeath:Lcom/b/a/a/d;

.field public static final enum PenaltyDeathOnNetwork:Lcom/b/a/a/d;

.field public static final enum PenaltyDialog:Lcom/b/a/a/d;

.field public static final enum PenaltyDropBox:Lcom/b/a/a/d;

.field public static final enum PenaltyFlashScreen:Lcom/b/a/a/d;

.field public static final enum PenaltyLog:Lcom/b/a/a/d;

.field public static final enum PermitAll:Lcom/b/a/a/d;

.field public static final enum PermitCustomSlowCalls:Lcom/b/a/a/d;

.field public static final enum PermitDisk:Lcom/b/a/a/d;

.field public static final enum PermitNetwork:Lcom/b/a/a/d;

.field public static final enum Reset:Lcom/b/a/a/d;


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

    .line 58
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "Lax"

    new-instance v2, Lcom/b/a/a/a/l;

    invoke-direct {v2}, Lcom/b/a/a/a/l;-><init>()V

    invoke-direct {v0, v1, v4, v2}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->Lax:Lcom/b/a/a/d;

    .line 59
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "Reset"

    new-instance v2, Lcom/b/a/a/a/w;

    invoke-direct {v2}, Lcom/b/a/a/a/w;-><init>()V

    invoke-direct {v0, v1, v5, v2}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->Reset:Lcom/b/a/a/d;

    .line 60
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "PermitAll"

    new-instance v2, Lcom/b/a/a/a/s;

    invoke-direct {v2}, Lcom/b/a/a/a/s;-><init>()V

    invoke-direct {v0, v1, v6, v2}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->PermitAll:Lcom/b/a/a/d;

    .line 61
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "DetectAll"

    new-instance v2, Lcom/b/a/a/a/h;

    invoke-direct {v2}, Lcom/b/a/a/a/h;-><init>()V

    invoke-direct {v0, v1, v7, v2}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->DetectAll:Lcom/b/a/a/d;

    .line 62
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "PermitDisk"

    new-instance v2, Lcom/b/a/a/a/u;

    invoke-direct {v2}, Lcom/b/a/a/a/u;-><init>()V

    invoke-direct {v0, v1, v8, v2}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->PermitDisk:Lcom/b/a/a/d;

    .line 63
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "DetectDisk"

    const/4 v2, 0x5

    new-instance v3, Lcom/b/a/a/a/j;

    invoke-direct {v3}, Lcom/b/a/a/a/j;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->DetectDisk:Lcom/b/a/a/d;

    .line 64
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "PermitNetwork"

    const/4 v2, 0x6

    new-instance v3, Lcom/b/a/a/a/v;

    invoke-direct {v3}, Lcom/b/a/a/a/v;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->PermitNetwork:Lcom/b/a/a/d;

    .line 65
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "DetectNetwork"

    const/4 v2, 0x7

    new-instance v3, Lcom/b/a/a/a/k;

    invoke-direct {v3}, Lcom/b/a/a/a/k;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->DetectNetwork:Lcom/b/a/a/d;

    .line 66
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "PermitCustomSlowCalls"

    const/16 v2, 0x8

    new-instance v3, Lcom/b/a/a/a/t;

    invoke-direct {v3}, Lcom/b/a/a/a/t;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->PermitCustomSlowCalls:Lcom/b/a/a/d;

    .line 67
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "DetectCustomSlowCalls"

    const/16 v2, 0x9

    new-instance v3, Lcom/b/a/a/a/i;

    invoke-direct {v3}, Lcom/b/a/a/a/i;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->DetectCustomSlowCalls:Lcom/b/a/a/d;

    .line 68
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "PenaltyDeath"

    const/16 v2, 0xa

    new-instance v3, Lcom/b/a/a/a/m;

    invoke-direct {v3}, Lcom/b/a/a/a/m;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->PenaltyDeath:Lcom/b/a/a/d;

    .line 69
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "PenaltyDeathOnNetwork"

    const/16 v2, 0xb

    new-instance v3, Lcom/b/a/a/a/n;

    invoke-direct {v3}, Lcom/b/a/a/a/n;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->PenaltyDeathOnNetwork:Lcom/b/a/a/d;

    .line 70
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "PenaltyDialog"

    const/16 v2, 0xc

    new-instance v3, Lcom/b/a/a/a/o;

    invoke-direct {v3}, Lcom/b/a/a/a/o;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->PenaltyDialog:Lcom/b/a/a/d;

    .line 71
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "PenaltyDropBox"

    const/16 v2, 0xd

    new-instance v3, Lcom/b/a/a/a/p;

    invoke-direct {v3}, Lcom/b/a/a/a/p;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->PenaltyDropBox:Lcom/b/a/a/d;

    .line 72
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "PenaltyLog"

    const/16 v2, 0xe

    new-instance v3, Lcom/b/a/a/a/r;

    invoke-direct {v3}, Lcom/b/a/a/a/r;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->PenaltyLog:Lcom/b/a/a/d;

    .line 73
    new-instance v0, Lcom/b/a/a/d;

    const-string v1, "PenaltyFlashScreen"

    const/16 v2, 0xf

    new-instance v3, Lcom/b/a/a/a/q;

    invoke-direct {v3}, Lcom/b/a/a/a/q;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a/d;-><init>(Ljava/lang/String;ILcom/b/a/a/g;)V

    sput-object v0, Lcom/b/a/a/d;->PenaltyFlashScreen:Lcom/b/a/a/d;

    .line 57
    const/16 v0, 0x10

    new-array v0, v0, [Lcom/b/a/a/d;

    sget-object v1, Lcom/b/a/a/d;->Lax:Lcom/b/a/a/d;

    aput-object v1, v0, v4

    sget-object v1, Lcom/b/a/a/d;->Reset:Lcom/b/a/a/d;

    aput-object v1, v0, v5

    sget-object v1, Lcom/b/a/a/d;->PermitAll:Lcom/b/a/a/d;

    aput-object v1, v0, v6

    sget-object v1, Lcom/b/a/a/d;->DetectAll:Lcom/b/a/a/d;

    aput-object v1, v0, v7

    sget-object v1, Lcom/b/a/a/d;->PermitDisk:Lcom/b/a/a/d;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/b/a/a/d;->DetectDisk:Lcom/b/a/a/d;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/b/a/a/d;->PermitNetwork:Lcom/b/a/a/d;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/b/a/a/d;->DetectNetwork:Lcom/b/a/a/d;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/b/a/a/d;->PermitCustomSlowCalls:Lcom/b/a/a/d;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/b/a/a/d;->DetectCustomSlowCalls:Lcom/b/a/a/d;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/b/a/a/d;->PenaltyDeath:Lcom/b/a/a/d;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/b/a/a/d;->PenaltyDeathOnNetwork:Lcom/b/a/a/d;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/b/a/a/d;->PenaltyDialog:Lcom/b/a/a/d;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/b/a/a/d;->PenaltyDropBox:Lcom/b/a/a/d;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/b/a/a/d;->PenaltyLog:Lcom/b/a/a/d;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/b/a/a/d;->PenaltyFlashScreen:Lcom/b/a/a/d;

    aput-object v2, v0, v1

    sput-object v0, Lcom/b/a/a/d;->$VALUES:[Lcom/b/a/a/d;

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
    .line 76
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 77
    iput-object p3, p0, Lcom/b/a/a/d;->mSetter:Lcom/b/a/a/g;

    .line 78
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/b/a/a/d;
    .locals 1

    .prologue
    .line 57
    const-class v0, Lcom/b/a/a/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/b/a/a/d;

    return-object v0
.end method

.method public static values()[Lcom/b/a/a/d;
    .locals 1

    .prologue
    .line 57
    sget-object v0, Lcom/b/a/a/d;->$VALUES:[Lcom/b/a/a/d;

    invoke-virtual {v0}, [Lcom/b/a/a/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/b/a/a/d;

    return-object v0
.end method


# virtual methods
.method public set()V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/b/a/a/d;->mSetter:Lcom/b/a/a/g;

    invoke-interface {v0}, Lcom/b/a/a/g;->set()V

    .line 83
    return-void
.end method

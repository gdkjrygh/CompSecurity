.class final enum Lcom/facebook/ui/touch/c;
.super Ljava/lang/Enum;
.source "DragMotionDetector.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/ui/touch/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/ui/touch/c;

.field public static final enum DEFERRING:Lcom/facebook/ui/touch/c;

.field public static final enum INTERCEPTING:Lcom/facebook/ui/touch/c;

.field public static final enum MONITORING:Lcom/facebook/ui/touch/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 75
    new-instance v0, Lcom/facebook/ui/touch/c;

    const-string v1, "MONITORING"

    invoke-direct {v0, v1, v2}, Lcom/facebook/ui/touch/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/touch/c;->MONITORING:Lcom/facebook/ui/touch/c;

    .line 76
    new-instance v0, Lcom/facebook/ui/touch/c;

    const-string v1, "INTERCEPTING"

    invoke-direct {v0, v1, v3}, Lcom/facebook/ui/touch/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/touch/c;->INTERCEPTING:Lcom/facebook/ui/touch/c;

    .line 77
    new-instance v0, Lcom/facebook/ui/touch/c;

    const-string v1, "DEFERRING"

    invoke-direct {v0, v1, v4}, Lcom/facebook/ui/touch/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/touch/c;->DEFERRING:Lcom/facebook/ui/touch/c;

    .line 74
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/ui/touch/c;

    sget-object v1, Lcom/facebook/ui/touch/c;->MONITORING:Lcom/facebook/ui/touch/c;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/ui/touch/c;->INTERCEPTING:Lcom/facebook/ui/touch/c;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/ui/touch/c;->DEFERRING:Lcom/facebook/ui/touch/c;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/ui/touch/c;->$VALUES:[Lcom/facebook/ui/touch/c;

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
    .line 74
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/ui/touch/c;
    .locals 1

    .prologue
    .line 74
    const-class v0, Lcom/facebook/ui/touch/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/touch/c;

    return-object v0
.end method

.method public static values()[Lcom/facebook/ui/touch/c;
    .locals 1

    .prologue
    .line 74
    sget-object v0, Lcom/facebook/ui/touch/c;->$VALUES:[Lcom/facebook/ui/touch/c;

    invoke-virtual {v0}, [Lcom/facebook/ui/touch/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/ui/touch/c;

    return-object v0
.end method

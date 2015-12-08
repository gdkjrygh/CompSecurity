.class public final enum Lcom/jirbo/adcolony/AdColonyIAPEngagement;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/jirbo/adcolony/AdColonyIAPEngagement;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AUTOMATIC:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

.field public static final enum END_CARD:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

.field public static final enum NONE:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

.field public static final enum OVERLAY:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

.field private static final synthetic a:[Lcom/jirbo/adcolony/AdColonyIAPEngagement;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 5
    new-instance v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lcom/jirbo/adcolony/AdColonyIAPEngagement;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->NONE:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    new-instance v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    const-string v1, "AUTOMATIC"

    invoke-direct {v0, v1, v3}, Lcom/jirbo/adcolony/AdColonyIAPEngagement;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->AUTOMATIC:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    new-instance v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    const-string v1, "OVERLAY"

    invoke-direct {v0, v1, v4}, Lcom/jirbo/adcolony/AdColonyIAPEngagement;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->OVERLAY:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    new-instance v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    const-string v1, "END_CARD"

    invoke-direct {v0, v1, v5}, Lcom/jirbo/adcolony/AdColonyIAPEngagement;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->END_CARD:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    .line 3
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    sget-object v1, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->NONE:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    aput-object v1, v0, v2

    sget-object v1, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->AUTOMATIC:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    aput-object v1, v0, v3

    sget-object v1, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->OVERLAY:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    aput-object v1, v0, v4

    sget-object v1, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->END_CARD:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    aput-object v1, v0, v5

    sput-object v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->a:[Lcom/jirbo/adcolony/AdColonyIAPEngagement;

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
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/jirbo/adcolony/AdColonyIAPEngagement;
    .locals 1

    .prologue
    .line 3
    const-class v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    return-object v0
.end method

.method public static values()[Lcom/jirbo/adcolony/AdColonyIAPEngagement;
    .locals 1

    .prologue
    .line 3
    sget-object v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->a:[Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    invoke-virtual {v0}, [Lcom/jirbo/adcolony/AdColonyIAPEngagement;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    return-object v0
.end method

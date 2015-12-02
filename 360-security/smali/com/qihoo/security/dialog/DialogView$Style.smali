.class public final enum Lcom/qihoo/security/dialog/DialogView$Style;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/dialog/DialogView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Style"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/dialog/DialogView$Style;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum TRANSPARENT:Lcom/qihoo/security/dialog/DialogView$Style;

.field private static final synthetic a:[Lcom/qihoo/security/dialog/DialogView$Style;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 174
    new-instance v0, Lcom/qihoo/security/dialog/DialogView$Style;

    const-string/jumbo v1, "TRANSPARENT"

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/dialog/DialogView$Style;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/dialog/DialogView$Style;->TRANSPARENT:Lcom/qihoo/security/dialog/DialogView$Style;

    .line 173
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/qihoo/security/dialog/DialogView$Style;

    sget-object v1, Lcom/qihoo/security/dialog/DialogView$Style;->TRANSPARENT:Lcom/qihoo/security/dialog/DialogView$Style;

    aput-object v1, v0, v2

    sput-object v0, Lcom/qihoo/security/dialog/DialogView$Style;->a:[Lcom/qihoo/security/dialog/DialogView$Style;

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
    .line 173
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/dialog/DialogView$Style;
    .locals 1

    .prologue
    .line 173
    const-class v0, Lcom/qihoo/security/dialog/DialogView$Style;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/dialog/DialogView$Style;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/dialog/DialogView$Style;
    .locals 1

    .prologue
    .line 173
    sget-object v0, Lcom/qihoo/security/dialog/DialogView$Style;->a:[Lcom/qihoo/security/dialog/DialogView$Style;

    invoke-virtual {v0}, [Lcom/qihoo/security/dialog/DialogView$Style;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/dialog/DialogView$Style;

    return-object v0
.end method

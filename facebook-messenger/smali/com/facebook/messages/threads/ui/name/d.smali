.class public final enum Lcom/facebook/messages/threads/ui/name/d;
.super Ljava/lang/Enum;
.source "ThreadNameView.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/messages/threads/ui/name/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/messages/threads/ui/name/d;

.field public static final enum USE_PARTICIPANTS_NAMES_ONLY:Lcom/facebook/messages/threads/ui/name/d;

.field public static final enum USE_THREAD_NAME_IF_AVAILABLE:Lcom/facebook/messages/threads/ui/name/d;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 26
    new-instance v0, Lcom/facebook/messages/threads/ui/name/d;

    const-string v1, "USE_THREAD_NAME_IF_AVAILABLE"

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/messages/threads/ui/name/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/messages/threads/ui/name/d;->USE_THREAD_NAME_IF_AVAILABLE:Lcom/facebook/messages/threads/ui/name/d;

    .line 27
    new-instance v0, Lcom/facebook/messages/threads/ui/name/d;

    const-string v1, "USE_PARTICIPANTS_NAMES_ONLY"

    invoke-direct {v0, v1, v3, v3}, Lcom/facebook/messages/threads/ui/name/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/messages/threads/ui/name/d;->USE_PARTICIPANTS_NAMES_ONLY:Lcom/facebook/messages/threads/ui/name/d;

    .line 24
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/messages/threads/ui/name/d;

    sget-object v1, Lcom/facebook/messages/threads/ui/name/d;->USE_THREAD_NAME_IF_AVAILABLE:Lcom/facebook/messages/threads/ui/name/d;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/messages/threads/ui/name/d;->USE_PARTICIPANTS_NAMES_ONLY:Lcom/facebook/messages/threads/ui/name/d;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/messages/threads/ui/name/d;->$VALUES:[Lcom/facebook/messages/threads/ui/name/d;

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
    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 32
    iput p3, p0, Lcom/facebook/messages/threads/ui/name/d;->value:I

    .line 33
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/messages/threads/ui/name/d;)I
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lcom/facebook/messages/threads/ui/name/d;->value:I

    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/messages/threads/ui/name/d;
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/facebook/messages/threads/ui/name/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/ui/name/d;

    return-object v0
.end method

.method public static values()[Lcom/facebook/messages/threads/ui/name/d;
    .locals 1

    .prologue
    .line 24
    sget-object v0, Lcom/facebook/messages/threads/ui/name/d;->$VALUES:[Lcom/facebook/messages/threads/ui/name/d;

    invoke-virtual {v0}, [Lcom/facebook/messages/threads/ui/name/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/messages/threads/ui/name/d;

    return-object v0
.end method

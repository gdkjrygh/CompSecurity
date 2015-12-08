.class public final enum Lcom/kik/view/adapters/bf$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/view/adapters/bf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401c
    name = "a"
.end annotation


# static fields
.field public static final enum a:Lcom/kik/view/adapters/bf$a;

.field public static final enum b:Lcom/kik/view/adapters/bf$a;

.field public static final enum c:Lcom/kik/view/adapters/bf$a;

.field private static final synthetic d:[Lcom/kik/view/adapters/bf$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 63
    new-instance v0, Lcom/kik/view/adapters/bf$a;

    const-string v1, "PREVIEW"

    invoke-direct {v0, v1, v2}, Lcom/kik/view/adapters/bf$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/kik/view/adapters/bf$a;->a:Lcom/kik/view/adapters/bf$a;

    new-instance v0, Lcom/kik/view/adapters/bf$a;

    const-string v1, "DOWNLOADING"

    invoke-direct {v0, v1, v3}, Lcom/kik/view/adapters/bf$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/kik/view/adapters/bf$a;->b:Lcom/kik/view/adapters/bf$a;

    new-instance v0, Lcom/kik/view/adapters/bf$a;

    const-string v1, "PLAYING"

    invoke-direct {v0, v1, v4}, Lcom/kik/view/adapters/bf$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/kik/view/adapters/bf$a;->c:Lcom/kik/view/adapters/bf$a;

    .line 62
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/kik/view/adapters/bf$a;

    sget-object v1, Lcom/kik/view/adapters/bf$a;->a:Lcom/kik/view/adapters/bf$a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/kik/view/adapters/bf$a;->b:Lcom/kik/view/adapters/bf$a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/kik/view/adapters/bf$a;->c:Lcom/kik/view/adapters/bf$a;

    aput-object v1, v0, v4

    sput-object v0, Lcom/kik/view/adapters/bf$a;->d:[Lcom/kik/view/adapters/bf$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kik/view/adapters/bf$a;
    .locals 1

    .prologue
    .line 62
    const-class v0, Lcom/kik/view/adapters/bf$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/bf$a;

    return-object v0
.end method

.method public static values()[Lcom/kik/view/adapters/bf$a;
    .locals 1

    .prologue
    .line 62
    sget-object v0, Lcom/kik/view/adapters/bf$a;->d:[Lcom/kik/view/adapters/bf$a;

    invoke-virtual {v0}, [Lcom/kik/view/adapters/bf$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/kik/view/adapters/bf$a;

    return-object v0
.end method

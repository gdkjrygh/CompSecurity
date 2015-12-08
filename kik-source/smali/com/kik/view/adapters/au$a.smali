.class final enum Lcom/kik/view/adapters/au$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/view/adapters/au;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field public static final enum a:Lcom/kik/view/adapters/au$a;

.field public static final enum b:Lcom/kik/view/adapters/au$a;

.field public static final enum c:Lcom/kik/view/adapters/au$a;

.field public static final enum d:Lcom/kik/view/adapters/au$a;

.field public static final enum e:Lcom/kik/view/adapters/au$a;

.field public static final enum f:Lcom/kik/view/adapters/au$a;

.field public static final enum g:Lcom/kik/view/adapters/au$a;

.field public static final enum h:Lcom/kik/view/adapters/au$a;

.field public static final enum i:Lcom/kik/view/adapters/au$a;

.field public static final enum j:Lcom/kik/view/adapters/au$a;

.field public static final enum k:Lcom/kik/view/adapters/au$a;

.field private static final synthetic l:[Lcom/kik/view/adapters/au$a;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 51
    new-instance v0, Lcom/kik/view/adapters/au$a;

    const-string v1, "VIEW_TYPE_SYSTEM"

    invoke-direct {v0, v1, v3}, Lcom/kik/view/adapters/au$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/kik/view/adapters/au$a;->a:Lcom/kik/view/adapters/au$a;

    .line 52
    new-instance v0, Lcom/kik/view/adapters/au$a;

    const-string v1, "VIEW_TYPE_CHAT"

    invoke-direct {v0, v1, v4}, Lcom/kik/view/adapters/au$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/kik/view/adapters/au$a;->b:Lcom/kik/view/adapters/au$a;

    .line 53
    new-instance v0, Lcom/kik/view/adapters/au$a;

    const-string v1, "VIEW_TYPE_ARTICLE"

    invoke-direct {v0, v1, v5}, Lcom/kik/view/adapters/au$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/kik/view/adapters/au$a;->c:Lcom/kik/view/adapters/au$a;

    .line 54
    new-instance v0, Lcom/kik/view/adapters/au$a;

    const-string v1, "VIEW_TYPE_REDACTED"

    invoke-direct {v0, v1, v6}, Lcom/kik/view/adapters/au$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/kik/view/adapters/au$a;->d:Lcom/kik/view/adapters/au$a;

    .line 55
    new-instance v0, Lcom/kik/view/adapters/au$a;

    const-string v1, "VIEW_TYPE_CONTENT_PHOTO"

    invoke-direct {v0, v1, v7}, Lcom/kik/view/adapters/au$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/kik/view/adapters/au$a;->e:Lcom/kik/view/adapters/au$a;

    .line 56
    new-instance v0, Lcom/kik/view/adapters/au$a;

    const-string v1, "VIEW_TYPE_CONTENT_PNG_PHOTO"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/kik/view/adapters/au$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/kik/view/adapters/au$a;->f:Lcom/kik/view/adapters/au$a;

    .line 57
    new-instance v0, Lcom/kik/view/adapters/au$a;

    const-string v1, "VIEW_TYPE_FULL_BLEED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/kik/view/adapters/au$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/kik/view/adapters/au$a;->g:Lcom/kik/view/adapters/au$a;

    .line 58
    new-instance v0, Lcom/kik/view/adapters/au$a;

    const-string v1, "VIEW_TYPE_VIDEO_FULL_BLEED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/kik/view/adapters/au$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/kik/view/adapters/au$a;->h:Lcom/kik/view/adapters/au$a;

    .line 59
    new-instance v0, Lcom/kik/view/adapters/au$a;

    const-string v1, "VIEW_TYPE_VIDEO_CLASSIC"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/kik/view/adapters/au$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/kik/view/adapters/au$a;->i:Lcom/kik/view/adapters/au$a;

    .line 60
    new-instance v0, Lcom/kik/view/adapters/au$a;

    const-string v1, "VIEW_TYPE_BANNER"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/kik/view/adapters/au$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/kik/view/adapters/au$a;->j:Lcom/kik/view/adapters/au$a;

    .line 61
    new-instance v0, Lcom/kik/view/adapters/au$a;

    const-string v1, "VIEW_TYPE_GIF"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/kik/view/adapters/au$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/kik/view/adapters/au$a;->k:Lcom/kik/view/adapters/au$a;

    .line 50
    const/16 v0, 0xb

    new-array v0, v0, [Lcom/kik/view/adapters/au$a;

    sget-object v1, Lcom/kik/view/adapters/au$a;->a:Lcom/kik/view/adapters/au$a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/kik/view/adapters/au$a;->b:Lcom/kik/view/adapters/au$a;

    aput-object v1, v0, v4

    sget-object v1, Lcom/kik/view/adapters/au$a;->c:Lcom/kik/view/adapters/au$a;

    aput-object v1, v0, v5

    sget-object v1, Lcom/kik/view/adapters/au$a;->d:Lcom/kik/view/adapters/au$a;

    aput-object v1, v0, v6

    sget-object v1, Lcom/kik/view/adapters/au$a;->e:Lcom/kik/view/adapters/au$a;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/kik/view/adapters/au$a;->f:Lcom/kik/view/adapters/au$a;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/kik/view/adapters/au$a;->g:Lcom/kik/view/adapters/au$a;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/kik/view/adapters/au$a;->h:Lcom/kik/view/adapters/au$a;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/kik/view/adapters/au$a;->i:Lcom/kik/view/adapters/au$a;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/kik/view/adapters/au$a;->j:Lcom/kik/view/adapters/au$a;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/kik/view/adapters/au$a;->k:Lcom/kik/view/adapters/au$a;

    aput-object v2, v0, v1

    sput-object v0, Lcom/kik/view/adapters/au$a;->l:[Lcom/kik/view/adapters/au$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kik/view/adapters/au$a;
    .locals 1

    .prologue
    .line 50
    const-class v0, Lcom/kik/view/adapters/au$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/au$a;

    return-object v0
.end method

.method public static values()[Lcom/kik/view/adapters/au$a;
    .locals 1

    .prologue
    .line 50
    sget-object v0, Lcom/kik/view/adapters/au$a;->l:[Lcom/kik/view/adapters/au$a;

    invoke-virtual {v0}, [Lcom/kik/view/adapters/au$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/kik/view/adapters/au$a;

    return-object v0
.end method

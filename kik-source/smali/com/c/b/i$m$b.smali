.class public final enum Lcom/c/b/i$m$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/bl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum a:Lcom/c/b/i$m$b;

.field public static final enum b:Lcom/c/b/i$m$b;

.field public static final enum c:Lcom/c/b/i$m$b;

.field private static d:Lcom/c/b/au$b;

.field private static final e:[Lcom/c/b/i$m$b;

.field private static final synthetic h:[Lcom/c/b/i$m$b;


# instance fields
.field private final f:I

.field private final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 21021
    new-instance v0, Lcom/c/b/i$m$b;

    const-string v1, "STRING"

    invoke-direct {v0, v1, v2, v2, v2}, Lcom/c/b/i$m$b;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/c/b/i$m$b;->a:Lcom/c/b/i$m$b;

    .line 21025
    new-instance v0, Lcom/c/b/i$m$b;

    const-string v1, "CORD"

    invoke-direct {v0, v1, v3, v3, v3}, Lcom/c/b/i$m$b;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/c/b/i$m$b;->b:Lcom/c/b/i$m$b;

    .line 21029
    new-instance v0, Lcom/c/b/i$m$b;

    const-string v1, "STRING_PIECE"

    invoke-direct {v0, v1, v4, v4, v4}, Lcom/c/b/i$m$b;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/c/b/i$m$b;->c:Lcom/c/b/i$m$b;

    .line 21012
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/c/b/i$m$b;

    sget-object v1, Lcom/c/b/i$m$b;->a:Lcom/c/b/i$m$b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/c/b/i$m$b;->b:Lcom/c/b/i$m$b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/c/b/i$m$b;->c:Lcom/c/b/i$m$b;

    aput-object v1, v0, v4

    sput-object v0, Lcom/c/b/i$m$b;->h:[Lcom/c/b/i$m$b;

    .line 21068
    new-instance v0, Lcom/c/b/v;

    invoke-direct {v0}, Lcom/c/b/v;-><init>()V

    sput-object v0, Lcom/c/b/i$m$b;->d:Lcom/c/b/au$b;

    .line 21088
    invoke-static {}, Lcom/c/b/i$m$b;->values()[Lcom/c/b/i$m$b;

    move-result-object v0

    sput-object v0, Lcom/c/b/i$m$b;->e:[Lcom/c/b/i$m$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0

    .prologue
    .line 21102
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 21103
    iput p3, p0, Lcom/c/b/i$m$b;->f:I

    .line 21104
    iput p4, p0, Lcom/c/b/i$m$b;->g:I

    .line 21105
    return-void
.end method

.method public static a(I)Lcom/c/b/i$m$b;
    .locals 1

    .prologue
    .line 21055
    packed-switch p0, :pswitch_data_0

    .line 21059
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 21056
    :pswitch_0
    sget-object v0, Lcom/c/b/i$m$b;->a:Lcom/c/b/i$m$b;

    goto :goto_0

    .line 21057
    :pswitch_1
    sget-object v0, Lcom/c/b/i$m$b;->b:Lcom/c/b/i$m$b;

    goto :goto_0

    .line 21058
    :pswitch_2
    sget-object v0, Lcom/c/b/i$m$b;->c:Lcom/c/b/i$m$b;

    goto :goto_0

    .line 21055
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/c/b/i$m$b;
    .locals 1

    .prologue
    .line 21012
    const-class v0, Lcom/c/b/i$m$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$m$b;

    return-object v0
.end method

.method public static values()[Lcom/c/b/i$m$b;
    .locals 1

    .prologue
    .line 21012
    sget-object v0, Lcom/c/b/i$m$b;->h:[Lcom/c/b/i$m$b;

    invoke-virtual {v0}, [Lcom/c/b/i$m$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/c/b/i$m$b;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 21051
    iget v0, p0, Lcom/c/b/i$m$b;->g:I

    return v0
.end method

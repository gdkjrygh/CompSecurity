.class public final enum Lcom/c/b/i$k$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/bl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum a:Lcom/c/b/i$k$b;

.field public static final enum b:Lcom/c/b/i$k$b;

.field public static final enum c:Lcom/c/b/i$k$b;

.field private static d:Lcom/c/b/au$b;

.field private static final e:[Lcom/c/b/i$k$b;

.field private static final synthetic h:[Lcom/c/b/i$k$b;


# instance fields
.field private final f:I

.field private final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x0

    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 9624
    new-instance v0, Lcom/c/b/i$k$b;

    const-string v1, "LABEL_OPTIONAL"

    invoke-direct {v0, v1, v4, v4, v2}, Lcom/c/b/i$k$b;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/c/b/i$k$b;->a:Lcom/c/b/i$k$b;

    .line 9628
    new-instance v0, Lcom/c/b/i$k$b;

    const-string v1, "LABEL_REQUIRED"

    invoke-direct {v0, v1, v2, v2, v3}, Lcom/c/b/i$k$b;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/c/b/i$k$b;->b:Lcom/c/b/i$k$b;

    .line 9636
    new-instance v0, Lcom/c/b/i$k$b;

    const-string v1, "LABEL_REPEATED"

    invoke-direct {v0, v1, v3, v3, v5}, Lcom/c/b/i$k$b;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/c/b/i$k$b;->c:Lcom/c/b/i$k$b;

    .line 9615
    new-array v0, v5, [Lcom/c/b/i$k$b;

    sget-object v1, Lcom/c/b/i$k$b;->a:Lcom/c/b/i$k$b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/c/b/i$k$b;->b:Lcom/c/b/i$k$b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/c/b/i$k$b;->c:Lcom/c/b/i$k$b;

    aput-object v1, v0, v3

    sput-object v0, Lcom/c/b/i$k$b;->h:[Lcom/c/b/i$k$b;

    .line 9679
    new-instance v0, Lcom/c/b/s;

    invoke-direct {v0}, Lcom/c/b/s;-><init>()V

    sput-object v0, Lcom/c/b/i$k$b;->d:Lcom/c/b/au$b;

    .line 9699
    invoke-static {}, Lcom/c/b/i$k$b;->values()[Lcom/c/b/i$k$b;

    move-result-object v0

    sput-object v0, Lcom/c/b/i$k$b;->e:[Lcom/c/b/i$k$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0

    .prologue
    .line 9713
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 9714
    iput p3, p0, Lcom/c/b/i$k$b;->f:I

    .line 9715
    iput p4, p0, Lcom/c/b/i$k$b;->g:I

    .line 9716
    return-void
.end method

.method public static a(I)Lcom/c/b/i$k$b;
    .locals 1

    .prologue
    .line 9666
    packed-switch p0, :pswitch_data_0

    .line 9670
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 9667
    :pswitch_0
    sget-object v0, Lcom/c/b/i$k$b;->a:Lcom/c/b/i$k$b;

    goto :goto_0

    .line 9668
    :pswitch_1
    sget-object v0, Lcom/c/b/i$k$b;->b:Lcom/c/b/i$k$b;

    goto :goto_0

    .line 9669
    :pswitch_2
    sget-object v0, Lcom/c/b/i$k$b;->c:Lcom/c/b/i$k$b;

    goto :goto_0

    .line 9666
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/c/b/i$k$b;
    .locals 1

    .prologue
    .line 9615
    const-class v0, Lcom/c/b/i$k$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$k$b;

    return-object v0
.end method

.method public static values()[Lcom/c/b/i$k$b;
    .locals 1

    .prologue
    .line 9615
    sget-object v0, Lcom/c/b/i$k$b;->h:[Lcom/c/b/i$k$b;

    invoke-virtual {v0}, [Lcom/c/b/i$k$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/c/b/i$k$b;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 9662
    iget v0, p0, Lcom/c/b/i$k$b;->g:I

    return v0
.end method

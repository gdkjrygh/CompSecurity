.class public final enum Lb/a/bb;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lb/a/bb;

.field public static final enum b:Lb/a/bb;

.field private static final synthetic d:[Lb/a/bb;


# instance fields
.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x2

    const/4 v3, 0x0

    const/4 v2, 0x1

    new-instance v0, Lb/a/bb;

    const-string v1, "LEGIT"

    invoke-direct {v0, v1, v3, v2}, Lb/a/bb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb/a/bb;->a:Lb/a/bb;

    new-instance v0, Lb/a/bb;

    const-string v1, "ALIEN"

    invoke-direct {v0, v1, v2, v4}, Lb/a/bb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb/a/bb;->b:Lb/a/bb;

    new-array v0, v4, [Lb/a/bb;

    sget-object v1, Lb/a/bb;->a:Lb/a/bb;

    aput-object v1, v0, v3

    sget-object v1, Lb/a/bb;->b:Lb/a/bb;

    aput-object v1, v0, v2

    sput-object v0, Lb/a/bb;->d:[Lb/a/bb;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lb/a/bb;->c:I

    return-void
.end method

.method public static a(I)Lb/a/bb;
    .locals 1

    packed-switch p0, :pswitch_data_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :pswitch_0
    sget-object v0, Lb/a/bb;->a:Lb/a/bb;

    goto :goto_0

    :pswitch_1
    sget-object v0, Lb/a/bb;->b:Lb/a/bb;

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lb/a/bb;
    .locals 1

    const-class v0, Lb/a/bb;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lb/a/bb;

    return-object v0
.end method

.method public static values()[Lb/a/bb;
    .locals 1

    sget-object v0, Lb/a/bb;->d:[Lb/a/bb;

    invoke-virtual {v0}, [Lb/a/bb;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/a/bb;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lb/a/bb;->c:I

    return v0
.end method

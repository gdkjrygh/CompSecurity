.class public final enum Lcom/kik/n/a/b/i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/n/a/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum a:Lcom/kik/n/a/b/i$a;

.field public static final enum b:Lcom/kik/n/a/b/i$a;

.field private static final synthetic d:[Lcom/kik/n/a/b/i$a;


# instance fields
.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 50
    new-instance v0, Lcom/kik/n/a/b/i$a;

    const-string v1, "PROFILE"

    invoke-direct {v0, v1, v3, v2}, Lcom/kik/n/a/b/i$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/kik/n/a/b/i$a;->a:Lcom/kik/n/a/b/i$a;

    .line 51
    new-instance v0, Lcom/kik/n/a/b/i$a;

    const-string v1, "LOCATION"

    invoke-direct {v0, v1, v2, v4}, Lcom/kik/n/a/b/i$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/kik/n/a/b/i$a;->b:Lcom/kik/n/a/b/i$a;

    .line 48
    new-array v0, v4, [Lcom/kik/n/a/b/i$a;

    sget-object v1, Lcom/kik/n/a/b/i$a;->a:Lcom/kik/n/a/b/i$a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/kik/n/a/b/i$a;->b:Lcom/kik/n/a/b/i$a;

    aput-object v1, v0, v2

    sput-object v0, Lcom/kik/n/a/b/i$a;->d:[Lcom/kik/n/a/b/i$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 57
    iput p3, p0, Lcom/kik/n/a/b/i$a;->c:I

    .line 58
    return-void
.end method

.method public static a(I)Lcom/kik/n/a/b/i$a;
    .locals 1

    .prologue
    .line 67
    packed-switch p0, :pswitch_data_0

    .line 71
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 69
    :pswitch_0
    sget-object v0, Lcom/kik/n/a/b/i$a;->a:Lcom/kik/n/a/b/i$a;

    goto :goto_0

    .line 70
    :pswitch_1
    sget-object v0, Lcom/kik/n/a/b/i$a;->b:Lcom/kik/n/a/b/i$a;

    goto :goto_0

    .line 67
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kik/n/a/b/i$a;
    .locals 1

    .prologue
    .line 48
    const-class v0, Lcom/kik/n/a/b/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/kik/n/a/b/i$a;

    return-object v0
.end method

.method public static values()[Lcom/kik/n/a/b/i$a;
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lcom/kik/n/a/b/i$a;->d:[Lcom/kik/n/a/b/i$a;

    invoke-virtual {v0}, [Lcom/kik/n/a/b/i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/kik/n/a/b/i$a;

    return-object v0
.end method

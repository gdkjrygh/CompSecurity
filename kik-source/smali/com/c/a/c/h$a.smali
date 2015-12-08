.class final enum Lcom/c/a/c/h$a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/c/a/c/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/c/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field public static final enum a:Lcom/c/a/c/h$a;

.field private static final synthetic b:[Lcom/c/a/c/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 67
    new-instance v0, Lcom/c/a/c/h$a;

    const-string v1, "INSTANCE"

    invoke-direct {v0, v1}, Lcom/c/a/c/h$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/c/h$a;->a:Lcom/c/a/c/h$a;

    .line 66
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/c/a/c/h$a;

    const/4 v1, 0x0

    sget-object v2, Lcom/c/a/c/h$a;->a:Lcom/c/a/c/h$a;

    aput-object v2, v0, v1

    sput-object v0, Lcom/c/a/c/h$a;->b:[Lcom/c/a/c/h$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 66
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/c/a/c/h$a;
    .locals 1

    .prologue
    .line 66
    const-class v0, Lcom/c/a/c/h$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/c/a/c/h$a;

    return-object v0
.end method

.method public static values()[Lcom/c/a/c/h$a;
    .locals 1

    .prologue
    .line 66
    sget-object v0, Lcom/c/a/c/h$a;->b:[Lcom/c/a/c/h$a;

    invoke-virtual {v0}, [Lcom/c/a/c/h$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/c/a/c/h$a;

    return-object v0
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Lcom/c/a/c/n;)V
    .locals 0

    .prologue
    .line 66
    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p2, p1}, Lcom/c/a/c/n;->b(Ljava/lang/CharSequence;)Lcom/c/a/c/n;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    const-string v0, "Funnels.unencodedCharsFunnel()"

    return-object v0
.end method

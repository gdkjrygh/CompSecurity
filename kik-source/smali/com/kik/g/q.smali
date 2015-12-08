.class public Lcom/kik/g/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/g/q$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/kik/g/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 31
    new-instance v0, Lcom/kik/g/n;

    new-instance v1, Lcom/kik/g/q$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/kik/g/q$a;-><init>(B)V

    invoke-direct {v0, v1}, Lcom/kik/g/n;-><init>(Lcom/kik/g/n$a;)V

    sput-object v0, Lcom/kik/g/q;->a:Lcom/kik/g/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    return-void
.end method


# virtual methods
.method public g()Z
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    return v0
.end method

.method public h()Z
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x0

    return v0
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x0

    return v0
.end method

.method public j()Z
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    return v0
.end method

.class public Landroid/support/v4/app/q$a;
.super Landroid/support/v4/app/s$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final d:Landroid/support/v4/app/s$a$a;


# instance fields
.field public a:I

.field public b:Ljava/lang/CharSequence;

.field public c:Landroid/app/PendingIntent;

.field private final e:Landroid/os/Bundle;

.field private final f:[Landroid/support/v4/app/aa;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1700
    new-instance v0, Landroid/support/v4/app/q$a$1;

    invoke-direct {v0}, Landroid/support/v4/app/q$a$1;-><init>()V

    sput-object v0, Landroid/support/v4/app/q$a;->d:Landroid/support/v4/app/s$a$a;

    return-void
.end method


# virtual methods
.method protected a()I
    .locals 1

    .prologue
    .line 1461
    iget v0, p0, Landroid/support/v4/app/q$a;->a:I

    return v0
.end method

.method protected b()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 1466
    iget-object v0, p0, Landroid/support/v4/app/q$a;->b:Ljava/lang/CharSequence;

    return-object v0
.end method

.method protected c()Landroid/app/PendingIntent;
    .locals 1

    .prologue
    .line 1471
    iget-object v0, p0, Landroid/support/v4/app/q$a;->c:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public d()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 1478
    iget-object v0, p0, Landroid/support/v4/app/q$a;->e:Landroid/os/Bundle;

    return-object v0
.end method

.method public e()[Landroid/support/v4/app/aa;
    .locals 1

    .prologue
    .line 1486
    iget-object v0, p0, Landroid/support/v4/app/q$a;->f:[Landroid/support/v4/app/aa;

    return-object v0
.end method

.method public synthetic f()[Landroid/support/v4/app/ac$a;
    .locals 1

    .prologue
    .line 1428
    invoke-virtual {p0}, Landroid/support/v4/app/q$a;->e()[Landroid/support/v4/app/aa;

    move-result-object v0

    return-object v0
.end method

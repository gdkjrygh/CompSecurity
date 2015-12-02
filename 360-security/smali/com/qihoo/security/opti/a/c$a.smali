.class public Lcom/qihoo/security/opti/a/c$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Z

.field public d:Z

.field public e:I

.field f:Landroid/content/pm/ApplicationInfo;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object v1, p0, Lcom/qihoo/security/opti/a/c$a;->a:Ljava/lang/String;

    .line 92
    iput-object v1, p0, Lcom/qihoo/security/opti/a/c$a;->b:Ljava/lang/String;

    .line 93
    iput-boolean v0, p0, Lcom/qihoo/security/opti/a/c$a;->c:Z

    .line 94
    iput-boolean v0, p0, Lcom/qihoo/security/opti/a/c$a;->d:Z

    .line 96
    iput v0, p0, Lcom/qihoo/security/opti/a/c$a;->e:I

    .line 97
    iput-object v1, p0, Lcom/qihoo/security/opti/a/c$a;->f:Landroid/content/pm/ApplicationInfo;

    return-void
.end method

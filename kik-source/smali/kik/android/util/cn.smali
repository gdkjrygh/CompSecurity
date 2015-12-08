.class final Lkik/android/util/cn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/r$a;


# instance fields
.field final synthetic a:Lkik/android/util/ck$b;

.field final synthetic b:Lkik/android/util/ck;


# direct methods
.method constructor <init>(Lkik/android/util/ck;Lkik/android/util/ck$b;)V
    .locals 0

    .prologue
    .line 224
    iput-object p1, p0, Lkik/android/util/cn;->b:Lkik/android/util/ck;

    iput-object p2, p0, Lkik/android/util/cn;->a:Lkik/android/util/ck$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/volley/w;)V
    .locals 2

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/util/cn;->b:Lkik/android/util/ck;

    invoke-static {v0}, Lkik/android/util/ck;->a(Lkik/android/util/ck;)Ljava/util/EnumMap;

    move-result-object v0

    iget-object v1, p0, Lkik/android/util/cn;->a:Lkik/android/util/ck$b;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/util/ck$a;

    sget v1, Lkik/android/util/ck$a$a;->a:I

    iput v1, v0, Lkik/android/util/ck$a;->d:I

    .line 229
    invoke-virtual {p1}, Lcom/android/volley/w;->printStackTrace()V

    .line 230
    return-void
.end method

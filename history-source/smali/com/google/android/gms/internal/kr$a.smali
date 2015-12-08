.class public Lcom/google/android/gms/internal/kr$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/kr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/kt;


# instance fields
.field private final CK:I

.field protected final NL:I

.field protected final NM:Z

.field protected final NN:I

.field protected final NO:Z

.field protected final NP:Ljava/lang/String;

.field protected final NQ:I

.field protected final NR:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/internal/kr;",
            ">;"
        }
    .end annotation
.end field

.field protected final NS:Ljava/lang/String;

.field private NT:Lcom/google/android/gms/internal/kv;

.field private NU:Lcom/google/android/gms/internal/kr$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/kr$b",
            "<TI;TO;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/kt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kt;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/kr$a;->CREATOR:Lcom/google/android/gms/internal/kt;

    return-void
.end method

.method constructor <init>(IIZIZLjava/lang/String;ILjava/lang/String;Lcom/google/android/gms/internal/km;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/kr$a;->CK:I

    iput p2, p0, Lcom/google/android/gms/internal/kr$a;->NL:I

    iput-boolean p3, p0, Lcom/google/android/gms/internal/kr$a;->NM:Z

    iput p4, p0, Lcom/google/android/gms/internal/kr$a;->NN:I

    iput-boolean p5, p0, Lcom/google/android/gms/internal/kr$a;->NO:Z

    iput-object p6, p0, Lcom/google/android/gms/internal/kr$a;->NP:Ljava/lang/String;

    iput p7, p0, Lcom/google/android/gms/internal/kr$a;->NQ:I

    if-nez p8, :cond_0

    iput-object v1, p0, Lcom/google/android/gms/internal/kr$a;->NR:Ljava/lang/Class;

    iput-object v1, p0, Lcom/google/android/gms/internal/kr$a;->NS:Ljava/lang/String;

    :goto_0
    if-nez p9, :cond_1

    iput-object v1, p0, Lcom/google/android/gms/internal/kr$a;->NU:Lcom/google/android/gms/internal/kr$b;

    :goto_1
    return-void

    :cond_0
    const-class v0, Lcom/google/android/gms/internal/ky;

    iput-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NR:Ljava/lang/Class;

    iput-object p8, p0, Lcom/google/android/gms/internal/kr$a;->NS:Ljava/lang/String;

    goto :goto_0

    :cond_1
    invoke-virtual {p9}, Lcom/google/android/gms/internal/km;->hG()Lcom/google/android/gms/internal/kr$b;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NU:Lcom/google/android/gms/internal/kr$b;

    goto :goto_1
.end method

.method protected constructor <init>(IZIZLjava/lang/String;ILjava/lang/Class;Lcom/google/android/gms/internal/kr$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZIZ",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/internal/kr;",
            ">;",
            "Lcom/google/android/gms/internal/kr$b",
            "<TI;TO;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/kr$a;->CK:I

    iput p1, p0, Lcom/google/android/gms/internal/kr$a;->NL:I

    iput-boolean p2, p0, Lcom/google/android/gms/internal/kr$a;->NM:Z

    iput p3, p0, Lcom/google/android/gms/internal/kr$a;->NN:I

    iput-boolean p4, p0, Lcom/google/android/gms/internal/kr$a;->NO:Z

    iput-object p5, p0, Lcom/google/android/gms/internal/kr$a;->NP:Ljava/lang/String;

    iput p6, p0, Lcom/google/android/gms/internal/kr$a;->NQ:I

    iput-object p7, p0, Lcom/google/android/gms/internal/kr$a;->NR:Ljava/lang/Class;

    if-nez p7, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NS:Ljava/lang/String;

    :goto_0
    iput-object p8, p0, Lcom/google/android/gms/internal/kr$a;->NU:Lcom/google/android/gms/internal/kr$b;

    return-void

    :cond_0
    invoke-virtual {p7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NS:Ljava/lang/String;

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;ILcom/google/android/gms/internal/kr$b;Z)Lcom/google/android/gms/internal/kr$a;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lcom/google/android/gms/internal/kr$b",
            "<**>;Z)",
            "Lcom/google/android/gms/internal/kr$a;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/kr$a;

    invoke-interface {p2}, Lcom/google/android/gms/internal/kr$b;->hI()I

    move-result v1

    invoke-interface {p2}, Lcom/google/android/gms/internal/kr$b;->hJ()I

    move-result v3

    const/4 v4, 0x0

    const/4 v7, 0x0

    move v2, p3

    move-object v5, p0

    move v6, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/kr$a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;Lcom/google/android/gms/internal/kr$b;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/kr$a;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/kr;",
            ">(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/google/android/gms/internal/kr$a",
            "<TT;TT;>;"
        }
    .end annotation

    const/16 v1, 0xb

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/internal/kr$a;

    const/4 v8, 0x0

    move v3, v1

    move v4, v2

    move-object v5, p0

    move v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/kr$a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;Lcom/google/android/gms/internal/kr$b;)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/kr$a;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/kr;",
            ">(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/google/android/gms/internal/kr$a",
            "<",
            "Ljava/util/ArrayList",
            "<TT;>;",
            "Ljava/util/ArrayList",
            "<TT;>;>;"
        }
    .end annotation

    const/16 v1, 0xb

    const/4 v2, 0x1

    new-instance v0, Lcom/google/android/gms/internal/kr$a;

    const/4 v8, 0x0

    move v3, v1

    move v4, v2

    move-object v5, p0

    move v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/kr$a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;Lcom/google/android/gms/internal/kr$b;)V

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/kr$a;)Lcom/google/android/gms/internal/kr$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NU:Lcom/google/android/gms/internal/kr$b;

    return-object v0
.end method

.method public static i(Ljava/lang/String;I)Lcom/google/android/gms/internal/kr$a;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lcom/google/android/gms/internal/kr$a",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v7, 0x0

    const/4 v1, 0x0

    new-instance v0, Lcom/google/android/gms/internal/kr$a;

    move v2, v1

    move v3, v1

    move v4, v1

    move-object v5, p0

    move v6, p1

    move-object v8, v7

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/kr$a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;Lcom/google/android/gms/internal/kr$b;)V

    return-object v0
.end method

.method public static j(Ljava/lang/String;I)Lcom/google/android/gms/internal/kr$a;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lcom/google/android/gms/internal/kr$a",
            "<",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    const/4 v7, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/internal/kr$a;

    move v3, v1

    move v4, v2

    move-object v5, p0

    move v6, p1

    move-object v8, v7

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/kr$a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;Lcom/google/android/gms/internal/kr$b;)V

    return-object v0
.end method

.method public static k(Ljava/lang/String;I)Lcom/google/android/gms/internal/kr$a;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lcom/google/android/gms/internal/kr$a",
            "<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/4 v7, 0x0

    const/4 v1, 0x6

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/internal/kr$a;

    move v3, v1

    move v4, v2

    move-object v5, p0

    move v6, p1

    move-object v8, v7

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/kr$a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;Lcom/google/android/gms/internal/kr$b;)V

    return-object v0
.end method

.method public static l(Ljava/lang/String;I)Lcom/google/android/gms/internal/kr$a;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lcom/google/android/gms/internal/kr$a",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v7, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/internal/kr$a;

    move v3, v1

    move v4, v2

    move-object v5, p0

    move v6, p1

    move-object v8, v7

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/kr$a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;Lcom/google/android/gms/internal/kr$b;)V

    return-object v0
.end method

.method public static m(Ljava/lang/String;I)Lcom/google/android/gms/internal/kr$a;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lcom/google/android/gms/internal/kr$a",
            "<",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    const/4 v7, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x1

    new-instance v0, Lcom/google/android/gms/internal/kr$a;

    move v3, v1

    move v4, v2

    move-object v5, p0

    move v6, p1

    move-object v8, v7

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/kr$a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;Lcom/google/android/gms/internal/kr$b;)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kv;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/kr$a;->NT:Lcom/google/android/gms/internal/kv;

    return-void
.end method

.method public convertBack(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TO;)TI;"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/kr$a;, "Lcom/google/android/gms/internal/kr$a<TI;TO;>;"
    .local p1, "output":Ljava/lang/Object;, "TO;"
    iget-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NU:Lcom/google/android/gms/internal/kr$b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/kr$b;->convertBack(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/kr$a;->CREATOR:Lcom/google/android/gms/internal/kt;

    const/4 v0, 0x0

    return v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/kr$a;->CK:I

    return v0
.end method

.method public hI()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/kr$a;->NL:I

    return v0
.end method

.method public hJ()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/kr$a;->NN:I

    return v0
.end method

.method public hN()Lcom/google/android/gms/internal/kr$a;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/kr$a",
            "<TI;TO;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/kr$a;

    iget v1, p0, Lcom/google/android/gms/internal/kr$a;->CK:I

    iget v2, p0, Lcom/google/android/gms/internal/kr$a;->NL:I

    iget-boolean v3, p0, Lcom/google/android/gms/internal/kr$a;->NM:Z

    iget v4, p0, Lcom/google/android/gms/internal/kr$a;->NN:I

    iget-boolean v5, p0, Lcom/google/android/gms/internal/kr$a;->NO:Z

    iget-object v6, p0, Lcom/google/android/gms/internal/kr$a;->NP:Ljava/lang/String;

    iget v7, p0, Lcom/google/android/gms/internal/kr$a;->NQ:I

    iget-object v8, p0, Lcom/google/android/gms/internal/kr$a;->NS:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kr$a;->hV()Lcom/google/android/gms/internal/km;

    move-result-object v9

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/kr$a;-><init>(IIZIZLjava/lang/String;ILjava/lang/String;Lcom/google/android/gms/internal/km;)V

    return-object v0
.end method

.method public hO()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/kr$a;->NM:Z

    return v0
.end method

.method public hP()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/kr$a;->NO:Z

    return v0
.end method

.method public hQ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NP:Ljava/lang/String;

    return-object v0
.end method

.method public hR()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/kr$a;->NQ:I

    return v0
.end method

.method public hS()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/internal/kr;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NR:Ljava/lang/Class;

    return-object v0
.end method

.method hT()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NS:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NS:Ljava/lang/String;

    goto :goto_0
.end method

.method public hU()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NU:Lcom/google/android/gms/internal/kr$b;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method hV()Lcom/google/android/gms/internal/km;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NU:Lcom/google/android/gms/internal/kr$b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NU:Lcom/google/android/gms/internal/kr$b;

    invoke-static {v0}, Lcom/google/android/gms/internal/km;->a(Lcom/google/android/gms/internal/kr$b;)Lcom/google/android/gms/internal/km;

    move-result-object v0

    goto :goto_0
.end method

.method public hW()Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/kr$a",
            "<**>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NS:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/jx;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NT:Lcom/google/android/gms/internal/kv;

    invoke-static {v0}, Lcom/google/android/gms/internal/jx;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NT:Lcom/google/android/gms/internal/kv;

    iget-object v1, p0, Lcom/google/android/gms/internal/kr$a;->NS:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kv;->bg(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const/16 v3, 0xa

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Field\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "            versionCode="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lcom/google/android/gms/internal/kr$a;->CK:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "                 typeIn="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lcom/google/android/gms/internal/kr$a;->NL:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "            typeInArray="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v2, p0, Lcom/google/android/gms/internal/kr$a;->NM:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "                typeOut="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lcom/google/android/gms/internal/kr$a;->NN:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "           typeOutArray="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v2, p0, Lcom/google/android/gms/internal/kr$a;->NO:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "        outputFieldName="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/kr$a;->NP:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "      safeParcelFieldId="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lcom/google/android/gms/internal/kr$a;->NQ:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "       concreteTypeName="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kr$a;->hT()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kr$a;->hS()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, "     concreteType.class="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kr$a;->hS()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    const-string v0, "          converterName="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NU:Lcom/google/android/gms/internal/kr$b;

    if-nez v0, :cond_1

    const-string v0, "null"

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/kr$a;->NU:Lcom/google/android/gms/internal/kr$b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/kr$a;, "Lcom/google/android/gms/internal/kr$a<TI;TO;>;"
    sget-object v0, Lcom/google/android/gms/internal/kr$a;->CREATOR:Lcom/google/android/gms/internal/kt;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/kt;->a(Lcom/google/android/gms/internal/kr$a;Landroid/os/Parcel;I)V

    return-void
.end method

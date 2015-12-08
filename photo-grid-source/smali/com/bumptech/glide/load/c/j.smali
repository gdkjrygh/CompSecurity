.class public Lcom/bumptech/glide/load/c/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/io/InputStream;

.field private final b:Landroid/os/ParcelFileDescriptor;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Landroid/os/ParcelFileDescriptor;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/bumptech/glide/load/c/j;->a:Ljava/io/InputStream;

    .line 16
    iput-object p2, p0, Lcom/bumptech/glide/load/c/j;->b:Landroid/os/ParcelFileDescriptor;

    .line 17
    return-void
.end method


# virtual methods
.method public final a()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/bumptech/glide/load/c/j;->a:Ljava/io/InputStream;

    return-object v0
.end method

.method public final b()Landroid/os/ParcelFileDescriptor;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/bumptech/glide/load/c/j;->b:Landroid/os/ParcelFileDescriptor;

    return-object v0
.end method
